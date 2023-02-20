package Introduction.If_Else;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        if(n%2 == 0 && (2<= n && n <= 5) | n> 20) {
            System.out.println("Not Weird");
        }else {
            System.out.println("Weird");
        }
    }
}
