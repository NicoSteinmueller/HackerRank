package Strings.Substring;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        int start = scan.nextInt();
        int end = scan.nextInt();
        scan.close();
        System.out.println(text.substring(start,end));
    }
}
