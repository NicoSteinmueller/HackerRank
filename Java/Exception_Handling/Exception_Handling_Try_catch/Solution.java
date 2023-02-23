package Exception_Handling.Exception_Handling_Try_catch;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int result = x/y;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (Exception e){
            System.out.println(e.getClass().toString().replace("class ",""));
        }
        scan.close();
    }
}
