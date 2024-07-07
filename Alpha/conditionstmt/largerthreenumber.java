// check betwwen three number which is greater number 

import java.util.*;
public class largerthreenumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter First number :");
       int a = sc.nextInt(); 
       System.out.print("Enter Second number :");
       int b = sc.nextInt();
       System.out.print("Enter third number :");
       int c = sc.nextInt();
       if(a>=b && a>=c)
       {
        System.out.println("a the greater number is :"+a);
        
       }
       else if(b>=c)
       {
        System.out.println("b the greater number is :"+b);
       }
       else 
       {
        System.out.println("c the greater number is :"+c);
       }

    }
}