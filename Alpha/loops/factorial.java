// Write a program to find the factorial of any number entered by the user.
import java.util.*;
public class factorial {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number :");
        int n = sc.nextInt();
        int fact = 1;
        for(int i = 1; i<= n;i++)
        {
            fact = fact*i;
        }

        System.out.print("The value of factoral is : "+fact);
    }
}
