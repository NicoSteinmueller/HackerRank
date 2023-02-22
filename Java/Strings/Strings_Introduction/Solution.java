package Strings.Strings_Introduction;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String in1 = scan.nextLine();
        String in2 = scan.nextLine();
        scan.close();
        System.out.println(in1.length()+in2.length());
        String[] unsorted = {in1,in2};
        String[] sorted = unsorted.clone();
        Arrays.sort(sorted);

        if (Arrays.equals(unsorted, sorted)){
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }

        in1 = in1.substring(0,1).toUpperCase()+in1.substring(1);
        in2 = in2.substring(0,1).toUpperCase()+in2.substring(1);
        System.out.println(in1+" "+in2);
    }
}
