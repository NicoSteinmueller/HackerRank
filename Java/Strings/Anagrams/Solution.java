package Strings.Anagrams;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String in1 = scan.nextLine();
        String in2 = scan.nextLine();
        scan.close();

        var arr1 = in1.toLowerCase().toCharArray();
        var arr2 = in2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)){
            System.out.println("Anagrams");
        }else {
            System.out.println("Not Anagrams");
        }
    }
}