// Write a method named isEven that accepts an int argument. The method
// should return true if the argument is even, or false otherwise. Also write a program to test
// your method

import java.util.Scanner;

public class eventry {
    // boolean isEven = true;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Enter any number ");
        n = sc.nextInt();
        if (isEven(n)) {
            System.out.println("Number is even");
        } else {
            System.out.print("number is odd");
        }

    }

    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
