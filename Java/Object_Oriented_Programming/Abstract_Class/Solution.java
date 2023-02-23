package Object_Oriented_Programming.Abstract_Class;

import java.util.Scanner;

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class MyBook extends Book{

    @Override
    void setTitle(String s) {
        title = s;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        MyBook book = new MyBook();
        book.setTitle(input);
        System.out.println("The title is: "+book.getTitle());
    }
}
