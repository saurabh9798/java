import java.util.*;

public class BintoDec {
    public static void bintodec(int binnum) {
        int pow = 0;
        int decnum = 0;

        while (binnum > 0) {
            int lastDigit = binnum % 10;
            decnum = decnum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binnum = binnum / 10;
        }
        System.out.println("decimal of " + binnum + " = " + decnum);
    }

    public static void main(String args[]) {
        bintodec(101);
    }
}