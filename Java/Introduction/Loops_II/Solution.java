package Introduction.Loops_II;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n1 = in.nextInt();
            int n2 = in.nextInt();
            int n3 = in.nextInt();
            in.close();
            int sum;
            sum = (int) (n1+Math.pow(2,0)*n2);
            System.out.print(sum);
            for (int i = 1; i < n3; i++) {
                sum = (int) (sum+Math.pow(2,i) *n2);
                System.out.print(" "+sum);
            }
            System.out.println();
        }
    }
}
