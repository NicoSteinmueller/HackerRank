package Data_Structures.List;

import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputs = scan.nextInt();
        var list = new LinkedList<Integer>();
        for (int i = 0; i < inputs; i++) {
            list.add(scan.nextInt());
        }
        inputs = scan.nextInt();
        for (int i = 0; i < inputs; i++) {
            if (scan.next().equals("Insert")){
                list.add(scan.nextInt(), scan.nextInt());
            }else {
                list.remove(scan.nextInt());
            }
        }
        scan.close();
        String output = "";
        for (var element : list) {
            output=output+element.toString()+" ";
        }
        System.out.println(output);
    }
}