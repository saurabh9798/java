import java.util.*;
public class SumofnNaturalnumber {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter any number :");
       int n = sc.nextInt();
       int i = 0;
       int sum = 0;
       while (i <= n)
       {
        System.out.print(i);
        sum = sum + i;
        i++;

       }
       System.out.print("The value of sum is :"+sum);
    }
}  
