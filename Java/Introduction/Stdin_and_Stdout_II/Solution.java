package Introduction.Stdin_and_Stdout_II;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i3 = scanner.nextInt();
        double d2 = Double.parseDouble(scanner.next());
        scanner.nextLine();
        String st1 = scanner.nextLine();
        scanner.close();

        System.out.println("String: "+st1);
        System.out.println("Double: " +d2);
        System.out.println("Int: "+i3);
    }
}
