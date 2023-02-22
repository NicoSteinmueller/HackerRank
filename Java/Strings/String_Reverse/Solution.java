package Strings.String_Reverse;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        scan.close();
        String reverse = new StringBuilder(text).reverse().toString();
        if (text.equals(reverse)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
