package Introduction.Currency_Formatter;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double payment = scan.nextDouble();
        scan.close();
        System.out.println("US: "+ NumberFormat.getCurrencyInstance(Locale.US).format(payment));
        DecimalFormat formatIndia = (DecimalFormat) NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        formatIndia.setPositivePrefix("Rs.");
        System.out.println("India: "+formatIndia.format(payment));
        DecimalFormat formatChina = (DecimalFormat) NumberFormat.getCurrencyInstance(Locale.CHINA);
        formatChina.setPositivePrefix(""+(char) 65509);
        System.out.println("China: "+formatChina.format(payment));
        System.out.println("France: "+NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment));
    }
}