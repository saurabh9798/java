
//Write a Java program to get a number from the user and print whether it is positive or negative
import java.util.*;

public class positiveneg {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("The entered number is positive.");
        } else if (num < 0) {
            System.out.println("The entered number is negative.");
        } else {
            System.out.println("The entered number is zero.");
        }

    }
}