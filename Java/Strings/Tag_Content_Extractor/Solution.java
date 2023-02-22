package Strings.Tag_Content_Extractor;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        while(testCases>0){
            String line = scan.nextLine();
            boolean match = false;
            Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()){
                match=true;
                System.out.println(matcher.group(2));
            }
            if (!match)
                System.out.println("None");
            testCases--;
        }
        scan.close();
    }
}
