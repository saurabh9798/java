import java.util.*;
public class blankhombus {
    public static void main(String args[]){
        System.out.print("Enter any number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i<=n;i++)
        {
            for(int k=n-1;k>=i;k--)
            {
                System.out.print(" ");
            }
            for(int j = 1 ;j<=n;j++)
            {
                // System.out.print("*");
                if(i==1 || i==n)
                {
                    System.out.print("*");
                }
                else if(j==1 || j==n){
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
