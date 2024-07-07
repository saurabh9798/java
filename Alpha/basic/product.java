import java.util.*;
public class product {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first element of product :");
        int a = sc.nextInt();
        System.out.print("Enter the second element of product :");
        int b = sc.nextInt();
        int product = a*b;
        System.out.println("Enter the final result of product a*b = "+product);
    }
}
