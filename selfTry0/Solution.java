import java.io.*;
import java.util.*;;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    double dl = sc.nextDouble();
    NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);
    NumberFormat nf2 = NumberFormat.getCurrencyInstance(new Locale("en", "IN")); 
    NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
    NumberFormat nf4 = NumberFormat.getCurrencyInstance(Locale.FRANCE);

    System.out.println("US: "+nf1.format(dl));
    System.out.println("India: "+nf2.format(dl));
    System.out.println("China: "+nf3.format(dl));
    System.out.println("France: "+nf4.format(dl));
    }
}
