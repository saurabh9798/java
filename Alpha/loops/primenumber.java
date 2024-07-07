import java.util.*;

public class primenumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number :");
        int n = sc.nextInt();
        // first methord
        // int count = 0;
        // for(int i = 1 ; i<=n ; i++)
        // {
        // if(n%i==0 && n%1 == 0 )
        // {
        // count++;
        // }
        // }
        // if(count==2)
        // {
        // System.out.println("Prime no ");
        // }
        // else{
        // System.out.println("not prime is ");
        // }

        // second methord

        if (n == 2) {
            System.out.print("prime no");
        } else {
            boolean isprime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isprime = false;
                }
            }
            if (isprime == true) {
                System.out.print("prime no");
            } else {
                System.out.print("not prime no");
            }
        }

    }
}
