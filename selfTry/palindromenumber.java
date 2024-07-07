import java.util.*;
public class palindromenumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number :");
        int n = sc.nextInt();
        int p = n;
        int temp = 0;
        while (n != 0) {

            int ls = n % 10;
            temp = (10 * temp) + ls;
            n = n / 10;
        }
        // System.out.print("the reverse number is :" + temp +" n = "+p);
        if(temp == p)
        {
            System.out.print("the number is palindrome");
        }
        else
        {
            System.out.print("the number is not palindrome");
        }
    }
}
