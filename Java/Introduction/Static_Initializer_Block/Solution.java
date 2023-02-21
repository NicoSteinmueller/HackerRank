package Introduction.Static_Initializer_Block;

import java.util.Scanner;

public class Solution {

    static boolean flag;
    static int B,H;

    static {
        Scanner in = new Scanner(System.in);
        B = in.nextInt();
        H = in.nextInt();
        in.close();
        if (B <=0||H<=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }else {
            flag=true;
        }
    }

    public static void main(String[] args) {
        if (flag) {
            System.out.println(B * H);
        }
    }
}