package Strings.Regex;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()){
            System.out.println(scan.next().matches("((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)(\\\\.)){3}+((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?))$"));
        }
        scan.close();
    }
}
