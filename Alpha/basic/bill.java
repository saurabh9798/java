// : Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
// an eraser. You have to output the total cost of the items back to the user as their bill.

import java.util.*;
public class bill {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of pen :");
        float pen = sc.nextFloat();
        System.out.print("Enter the price of pencil :");
        float pencil = sc.nextFloat();
        System.out.print("Enter the price of eraser :");
        float eraser = sc.nextFloat();
        float tc = pen + pencil +eraser;
        System.out.println("the bill of total item ="+tc);
        float newTotal = tc + (0.18f * tc);
System.out.println("Bill with 18% tax : " + newTotal);
    }
}