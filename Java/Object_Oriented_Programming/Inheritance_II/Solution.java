package Object_Oriented_Programming.Inheritance_II;

class Arithmetic{
    int add(int n1, int n2){
        return n1+n2;
    }
}

class Adder extends Arithmetic{

}
public class Solution{
    public static void main(String []args){
        Adder a = new Adder();

        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
    }
}