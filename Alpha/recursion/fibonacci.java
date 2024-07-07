import java.util.*;
public class fibonacci {
    public static int fibf(int n)
    {
        if (n== 0 || n==1 ) {
            return n;
        }
        
        int fnm1 = fibf(n-1);
        int fnm2 = fibf(n-2);
        int fN = fnm1+fnm2;
        return fN;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number :");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.print(fibf(i)+" ");
        }
        
    }
}
