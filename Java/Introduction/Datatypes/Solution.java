package Introduction.Datatypes;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.next();
        while (in.hasNextLine()){
            String str = in.next();
            String out = "";
            try {
                byte b = Byte.parseByte(str);
                out += "* byte\n";
            }catch (Exception ignored){

            }
            try {
                short b = Short.parseShort(str);
                out += "* short\n";
            }catch (Exception ignored){

            }
            try {
                int b = Integer.parseInt(str);
                out += "* int\n";
            }catch (Exception ignored){

            }
            try {
                long b = Long.parseLong(str);
                out += "* long\n";
            }catch (Exception ignored){

            }
            if (out.length()!=0){
                System.out.println( str +" can be fitted in:");
                System.out.print(out);
            }else {
                System.out.println( str +" can't be fitted anywhere.");
            }
        }
    }
}