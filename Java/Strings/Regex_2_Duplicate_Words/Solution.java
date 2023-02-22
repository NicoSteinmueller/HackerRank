package Strings.Regex_2_Duplicate_Words;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numSentences = Integer.parseInt(scan.nextLine());
        while (numSentences-- > 0){
            var lineItems = scan.nextLine().split(" ");
            System.out.print(lineItems[0]);
            for (int i = 1; i < lineItems.length; i++) {
                if (! lineItems[0].equalsIgnoreCase(lineItems[i])){
                    System.out.print(lineItems[i]);
                }
            }
            System.out.println();
        }
        scan.close();
    }
}
