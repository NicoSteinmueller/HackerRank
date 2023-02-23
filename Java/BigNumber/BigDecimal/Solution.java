package BigNumber.BigDecimal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution{
    public static void main(String []args){

        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        List<String> out = new ArrayList<>();
        for (var element: s) {
            if (out.isEmpty())
                out.add(element);
            else {
                var temp = element;
                if (!element.contains("-"))
                    temp = "0"+element;
                BigDecimal bigElement = new BigDecimal(temp);
                for (var item: out) {
                    var tempItem = item;
                    if (!item.contains("-"))
                        tempItem = "0"+item;
                    var bigItem = new BigDecimal(tempItem);
                    if (bigElement.equals(bigItem)) {
                        out.add(out.indexOf(item )+1, element);
                        break;
                    }
                    if (bigElement.compareTo(bigItem)>0) {
                        out.add(out.indexOf(item),element );
                        break;
                    }
                    if (out.indexOf(item) == out.size()-1 || out.lastIndexOf(item)==out.size()-1){
                        out.add(element);
                        break;
                    }
                }
            }
        }
        out.forEach(System.out::println);
    }
}
