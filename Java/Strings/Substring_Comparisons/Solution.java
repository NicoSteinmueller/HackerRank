package Strings.Substring_Comparisons;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        int length = scan.nextInt();
        scan.close();
        var list = new LinkedList<String>();
        for (int i = 0; i <= text.length()-length; i++) {
            list.add(text.substring(i, i+length));
        }
        String[] arr = list.toArray(new String[0]);
        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);

    }
}
