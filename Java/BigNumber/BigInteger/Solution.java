package BigNumber.BigInteger;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        var n1 = scan.nextBigInteger();
        var n2 = scan.nextBigInteger();
        scan.close();
        System.out.println(n1.add(n2));
        System.out.println(n1.multiply(n2));
    }
}
