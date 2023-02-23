package Data_Structures.Map;

import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String,String> map = new HashMap<>();
        int entrys = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < entrys; i++) {
            map.put(scan.nextLine(), scan.nextLine());
        }
        int count=100000;
        while (count!=0 && scan.hasNextLine()){
            count--;
            String search= scan.nextLine();
            String result = map.get(search);
            if (result == null){
                System.out.println("Not found");
            }else {
                System.out.println(search+"="+result);
            }
        }
        scan.close();
    }
}
