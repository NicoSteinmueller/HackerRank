package Strings.Valid_Username_Regular_Expression;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numInputs = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < numInputs; i++) {
            if (scan.nextLine().matches("[A-Za-z][A-Za-z_0-9]{7,29}")){
                System.out.println("Valid");
            }else {
                System.out.println("Invalid");
            }
        }
        scan.close();
    }
}
