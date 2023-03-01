package Data_Structures.Java_1D_Array_Part_2;

import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        return step(leap, game, 0);
    }

    static boolean step(int leap, int[] game, int index) {
        int gameLength = game.length;
        //lose game
        if(index <0 || game[index]==1) return false;
        //win game
        if (index+1 == gameLength || index+leap >= gameLength) return true;
        game[index] = 1;


        return step(leap, game, index+1) || step(leap,game,index-1) || step(leap, game, index+leap);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
