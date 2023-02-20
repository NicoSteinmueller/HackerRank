package Introduction.Output_Formatting;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");

        for (int i = 0; i <3; i++) {
            String str = scanner.next();
            String in = String.valueOf(scanner.nextInt());
            int strl = 15-str.length();
            for (int j = 0; j < strl; j++) {
                str = str + " ";
            }
            if (in.length() ==1) in= "0"+in;
            for (int j = 0; j < 3-in.length(); j++) {
                in = "0"+in;
            }
            System.out.println(str+in);
        }

        System.out.println("================================");
    }
}
