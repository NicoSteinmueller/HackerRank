package Advanced.Lambda_Expressions;


import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    static int number;
    static String input;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextLine()){
            var line = scan.nextLine().split(" ");
            int choice = Integer.parseInt(line[0]);
            if (Arrays.stream(line).count()==2)
                switch (choice) {
                    case 1 -> {
                        number = Integer.parseInt(line[1]);
                        isOdd();
                    }
                    case 2 -> {
                        number = Integer.parseInt(line[1]);
                        isPrime();
                    }
                    case 3 -> {
                        input = line[1];
                        isPalindrome();
                    }
                    default -> {
                    }
                }

        }
    }

    private static void isOdd(){
        if (number%2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
    }

    private static void isPrime() {
        boolean isPrime = true;
        for (int i = 3; i <= number-1; i +=2) {
            if (number%i ==0){
                isPrime = false;
                break;
            }
        }

        if (isPrime){
            System.out.println("PRIME");
        }else {
            System.out.println("COMPOSITE");
        }
    }

    private static void isPalindrome(){
        String check = new StringBuilder(input).reverse().toString();

        if (input.equals(check)){
            System.out.println("PALINDROME");
        }else {
            System.out.println("NOT PALINDROME");
        }
    }
}
