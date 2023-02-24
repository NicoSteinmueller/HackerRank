package Advanced.Stack;

import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()){
            String in = scan.next();
            Stack<Character> stack = new Stack<>();

            try {
                for (int i = 0; i < in.length(); i++) {
                    char ch = in.charAt(i);
                    if (ch=='{'|| ch=='(' || ch=='[')
                        stack.add(ch);

                    if (ch=='}'|| ch==')' || ch==']') {
                        char temp='0';
                        switch (ch) {
                            case '}' -> temp = '{';
                            case ')' -> temp = '(';
                            case ']' -> temp = '[';
                        }
                        if (stack.peek()==temp) {
                            stack.pop();
                        } else {
                            throw new Exception();
                        }
                    }
                }

                System.out.println(stack.isEmpty());
            }catch (Exception e){
                System.out.println(false);
            }
        }
        scan.close();
    }
}
