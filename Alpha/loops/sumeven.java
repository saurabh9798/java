
// Write a program that reads a set of integers, and then prints the sum of the even and odd integers
import java.util.*;

public class sumeven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number :");
        int n = sc.nextInt();
        int sum = 0;
        int sume = 0;
        for(int i = 1 ; i<=n ; i++)
        {
        if (n%2==0)
        {
        // sum = sum +
        // System.out.print("even number :");
        sum =sum +i;
        }
        else
        {
        // System.out.print("odd number :");
            sume = sume+i;
        }
        }
        System.out.println("Sum of all even numbers is " + sum);
        System.out.println("Sum of all odd numbers is " + sume);
    }
}
