package Data_Structures.Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = Integer.parseInt(scan.nextLine());
        var list = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n1; i++) {
            var tempList = new ArrayList<Integer>();
            var line = scan.nextLine();
            var lineSplit = line.split(" ");

            Arrays.stream(Arrays.copyOfRange(lineSplit,1, lineSplit.length)).forEach(element ->tempList.add(Integer.parseInt(element)));
            list.add(tempList);
        }

        int n2 = scan.nextInt();
        for (int i = 0; i < n2; i++) {
            int e1 = scan.nextInt()-1;
            int e2 = scan.nextInt()-1;

            try {
                System.out.println(list.get(e1).get(e2));
            }catch (Exception e){
                System.out.println("ERROR!");
            }
        }
        scan.close();
    }
}
