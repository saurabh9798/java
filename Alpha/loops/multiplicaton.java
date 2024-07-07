// Write a program to print the multiplication table of a number N, entered by the user.
import java.util.*;
public class multiplicaton {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number :");
        int a = sc.nextInt();
        for(int i = 1; i<=10 ; i++)
        {
            int c = a * i;
            System.out.println( a +" * "+ i +" = "+c);
        }

    }
}
