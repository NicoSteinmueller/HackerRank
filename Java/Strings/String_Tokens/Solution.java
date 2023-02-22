package Strings.String_Tokens;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        scan.close();
        List<String> list = new ArrayList<>();

        for (String s : text.split("[^A-Za-z]")) {
            if (!s.isBlank())
                list.add(s);
        }
        System.out.println(list.toArray().length);
        list.forEach(System.out::println);
    }
}
