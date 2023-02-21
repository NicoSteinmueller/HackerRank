package Introduction.End_of_File;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count=0;
        while (in.hasNext()){
            count++;
            System.out.println(count+" "+in.nextLine());
        }
        in.close();
    }
}