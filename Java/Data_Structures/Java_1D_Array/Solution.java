package Data_Structures.Java_1D_Array;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = Integer.parseInt(scan.nextLine());
        int[] arr = new int[count];
        for (int i = 0; i <count; i++) {
            arr[i] = Integer.parseInt(scan.nextLine());
        }
        scan.close();
        for (int num: arr) {
            System.out.println(num);
        }
    }
}
