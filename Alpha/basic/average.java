// In a program, input 3 numbers : A, B and C. You have to output the average of
// these 3 numbers.

import java.util.*;
public class average {
    public static void main(String args[]) {
        Scanner  sc = new Scanner(System.in);
        System.out.print("Enter first number :");
        int a = sc.nextInt();
        System.out.print("Enter Second number :");
        int b = sc.nextInt();
        System.out.print("Enter third number :");
        int c = sc.nextInt();
        int average = (a+b+c)/3;
        System.out.println(average);
    }
}