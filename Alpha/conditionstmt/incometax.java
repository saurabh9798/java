// here i'm creating income tax calculater
import java.util.*;
public class incometax {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your income :");
            int m = sc.nextInt();
            int tax;
            if(m<=500000)
            {
                tax = 0;
            }
            else if(m>=500000 && m<=1000000)
            {
                tax = (int)(m * 0.2);
            }
            else
            {
                tax = (int)(m * 0.3);
            }
            System.out.print("Your tax is : "+tax);
        }
}