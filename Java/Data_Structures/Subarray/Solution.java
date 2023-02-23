package Data_Structures.Subarray;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] input = new int[length];
        int negative = 0;
        for (int i = 0; i < length; i++) {
            input[i] = scan.nextInt();
        }
        scan.close();

        for (int i = 0; i < length; i++) {
            for (int j = i+1; j <= length; j++) {
                var arr = Arrays.copyOfRange(input,i,j);
                var sum = IntStream.of(arr).sum();

                if (sum<0)
                    negative++;
            }
        }
        System.out.println(negative);
    }
}