package Data_Structures.BitSet;

import java.util.BitSet;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);

        for (int i = 0; i < m; i++) {
            String option = scan.next();
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();

            switch (option) {
                case "AND" -> {
                    if (num1 == 1) {
                        b1.and(b2);
                    } else {
                        b2.and(b1);
                    }
                }
                case "OR" -> {
                    if (num1 == 1) {
                        b1.or(b2);
                    } else {
                        b2.or(b1);
                    }
                }
                case "XOR" -> {
                    if (num1 == 1) {
                        b1.xor(b2);
                    } else {
                        b2.xor(b1);
                    }
                }
                case "FLIP" -> {
                    if (num1 == 1) {
                        b1.flip(num2);
                    } else {
                        b2.flip(num2);
                    }
                }
                case "SET" -> {
                    if (num1 == 1) {
                        b1.set(num2);
                    } else {
                        b2.set(num2);
                    }
                }
                default -> System.out.println("Error!");
            }
            System.out.println(b1.cardinality()+" "+ b2.cardinality());
        }
        scan.close();
    }
}
