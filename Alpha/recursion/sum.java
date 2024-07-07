import java.util.*;
public class sum {

    public static void sum0(int n)
    {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum+i;
        }
        System.out.println("the final sum is : "+sum);
    }
    public static int sum1(int n) 
    {
        if (n==1) {
            return 1;
        }
        int snm1 = sum1(n-1);
        int sn = n+snm1;
        return sn;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        // sum0(n);
        System.out.print(sum1(n));
    }
}
