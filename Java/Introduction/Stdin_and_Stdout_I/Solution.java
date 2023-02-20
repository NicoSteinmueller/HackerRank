package Introduction.Stdin_and_Stdout_I;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println(scanner.next());
        }
        scanner.close();
    }
}
