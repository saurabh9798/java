import java.util.*;
public class evenodd{
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter any number : ");
       int a = sc.nextInt();
       if(a % 2 == 0)
       {
        System.out.print(a+" is even number ");
       }
       else
       {
        System.out.print(a+" is odd number ");
       }
    }
}