import java.util.*;
public class factoial {
    // factoial using simple method to find factorail useing loops 
    public static void facto0(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact*i;
        }
        System.out.println(fact);
    }
    public static int facto1(int n) {
        // int fact = 1;
        // if (n!=0) {   
        // fact = fact *n;
        // facto1(n-1);
        // }
        // System.out.println(fact);
        if (n==0) {
            return 1;
        }
        // int fnm1 = facto1(n-1);
        int fn = n*facto1(n-1);
        return fn;
    }
    public static void main(String[] args) {
        // System.out.println("helllo");
        System.out.print("Enter any number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println( facto1(n));
       
    }
}
