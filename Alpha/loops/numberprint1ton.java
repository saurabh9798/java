import java.util.*;
public class numberprint1ton {
   public static void main(String args[])
   {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter any number :");
     int n = sc.nextInt();
     int i = 1;
     while (i <= n)
     {
        System.out.print(i+ " ");
        i++;
     }
   } 
}
