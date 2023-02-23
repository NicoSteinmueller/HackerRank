package BigNumber.Primality_Test;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if (scan.nextBigInteger().isProbablePrime(100)){
            System.out.println("prime");
        }else {
            System.out.println("not prime");
        }
        scan.close();
    }
}
