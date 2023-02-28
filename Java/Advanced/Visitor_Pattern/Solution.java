package Advanced.Visitor_Pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.*;
import java.math.*;

import java.util.Scanner;

enum Color {
    RED, GREEN
}

abstract class Tree {

    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis
{
    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);

}

class SumInLeavesVisitor extends TreeVis {
    int sumInLeaves= 0;
    public int getResult() {
        return sumInLeaves;
    }

    public void visitNode(TreeNode node) {
        //implement this
    }

    public void visitLeaf(TreeLeaf leaf) {
        sumInLeaves+= leaf.getValue();
    }
}

class ProductOfRedNodesVisitor extends TreeVis {
    long productRedNodes=1L;
    public int getResult() {
        return (int) productRedNodes;
    }

    public void visitNode(TreeNode node) {
        if (node.getColor().equals(Color.RED)){
            int val = node.getValue();
            productRedNodes = (productRedNodes*val)%(1000000007);
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor().equals(Color.RED)){
            int val = leaf.getValue();
            productRedNodes = (productRedNodes*val)%(1000000007);
        }
    }
}

class FancyVisitor extends TreeVis {
    int nonLeaf = 0;
    int sumGreenLeaf = 0;
    public int getResult() {
        //implement this
        return (Math.abs(nonLeaf-sumGreenLeaf));
    }

    public void visitNode(TreeNode node) {
        if (node.getDepth()%2 == 0)
            nonLeaf += node.getValue();

    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor().equals(Color.GREEN))
            sumGreenLeaf+=leaf.getValue();
    }
}

public class Solution {
    static int N;
    static HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
    static int[] values;
    static int[] colors;
    static boolean [] mark;
    public static Tree dfs(int vertex){
        if(map.get(vertex).isEmpty())
            return new TreeLeaf(values[vertex], Color.values()[colors[vertex]], 0);
        else{
            mark = new boolean[N];
            return runDfs(vertex, 0);
        }
    }

    public static Tree runDfs(int vertex, int depth){
        mark[vertex] = true;
        ArrayList<Tree> childs = new ArrayList<>();
        for(Integer e : map.get(vertex))
            if(!mark[e])
                childs.add(runDfs(e, depth + 1));
        if(childs.isEmpty())
            return new TreeLeaf(values[vertex], Color.values()[colors[vertex]], depth);
        else{
            TreeNode node = new TreeNode(values[vertex], Color.values()[colors[vertex]], depth);
            for(Tree child : childs)
                node.addChild(child);
            return node;
        }
    }

    public static Tree solve() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            N = Integer.valueOf(br.readLine());
            values = new int[N];
            colors = new int[N];
            int parent, child;
            String[] chunks = br.readLine().split(" ");
            for(int i = 0; i < N; i++ ){
                map.put(i, new HashSet<Integer>());
                values[i] = Integer.valueOf(chunks[i]);
            }
            chunks = br.readLine().split(" ");
            for(int i = 0; i < N; i++ )
                colors[i] = Integer.valueOf(chunks[i]);
            for(int i = 0, length = N - 1; i < length; i++){
                chunks = br.readLine().split(" ");
                parent = Integer.valueOf(chunks[0]) - 1;
                child = Integer.valueOf(chunks[1]) - 1;

                map.get(parent).add(child);
                map.get(child).add(parent);

            }
            return dfs(0);
        } catch (IOException ex) {

        }
        return null;
    }

    public static void main(String[] args) {
        Tree root = solve();
        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        int res1 = vis1.getResult();
        int res2 = vis2.getResult();
        int res3 = vis3.getResult();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}


