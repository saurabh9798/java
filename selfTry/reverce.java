import java.util.*;

public class reverce {
    public static void arrrev(int n)
    {
        int temp = 0;
        while (n != 0) {

            int ls = n % 10;
            temp = (10 * temp) + ls;
            n = n / 10;
        }
        System.out.print("the reverse number is :" + temp);
    }
    public static void strrev(String str)
    {
        System.out.println(str);
        StringBuilder atr = new StringBuilder(str);
        atr.reverse();
        System.out.println(atr);
    }
    public static void main(String args[]) {
        //  arrrev(8729);
        strrev("saurabh kumar");
    }
}