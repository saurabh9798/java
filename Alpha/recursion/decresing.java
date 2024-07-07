import java.util.*;
public class decresing {
    public static void printdec0(int n) 
    {
        for (int i =n;i >=1;i-- ) {
            System.out.print(i+" ");
        }
    }
    public static void printdec1(int n) 
    {
        if (n != 0) {
           System.out.print(n+" ");
        printdec1(n-1);  
        }
       
    }
    public static void main(String[] args) {
        System.out.print("Enter any number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printdec0(n);
    }
}
