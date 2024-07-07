import java.util.*;
public class increse {
    public static void inc0(int n)
    {
        for (int i = 1; i <= n; i++) {
            System.out.print(i+" ");
        }
    }
    public static void inc1(int n)
    {
        if (n == 0) {
            return;
        }
        inc1(n-1);
        System.out.print(n+" ");
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        inc1(n);
    }
}
