// import java.util.*;
// public class hellowordprint{
//     public static void helloword()
//     {
//         System.out.print("hello world ");
//     }
    
//     public static void addition()
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println();
//         System.out.print("Enter any number :");
//         int a =  sc.nextInt();
//         System.out.print("Enter any number :");
//         int b =  sc.nextInt();
//         int c = a+b;
//         System.out.print("the value of a + b = "+c);
//     }
//     public static int  calculateSubtraction(int p,int q) /
//     // here p and q is parameter or foraml parameter 

//     {
        
//         int r = p-q;
//         return r;
        
//     }
//     public static void main(String args[])
//     {
        
//         // helloword();
//         // addition();
//         Scanner sc = new Scanner(System.in);
//         System.out.println();
//         System.out.print("Enter any number :");
//         int a =  sc.nextInt();
//         System.out.print("Enter any number :");
//         int b =  sc.nextInt();
//         int r =calculateSubtraction(a,b);

//         System.out.print("the value of a - b = "+r);
//         // here a and b is arguments or actual parameters 

//     }
// }
public class hellowordprint{
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
