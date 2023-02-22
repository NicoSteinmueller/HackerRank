package Strings.Pattern_Syntax_Checker;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        var list = new ArrayList<String>();
        int numberOfInputs = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < numberOfInputs; i++) {
            list.add(scan.nextLine());
        }
        scan.close();
        for (var s : list) {
            try {
                Pattern.compile(s);
                System.out.println("Valid");
            }catch (Exception e){
                System.out.println("Invalid");
            }
        }
    }
}
