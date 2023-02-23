package Data_Structures.Hashset;

import java.util.HashSet;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        int inputs = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < inputs; i++) {
            set.add(scan.nextLine());
            System.out.println(set.size());
        }
        scan.close();
    }
}
