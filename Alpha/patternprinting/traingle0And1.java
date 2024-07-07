import java.util.*;
public class traingle0And1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number :");
        int n = sc.nextInt();
        for(int i= 1 ; i<=n;i++)
        {
            for(int j= 1;j<=i;j++)
            {
                // System.out.print("*");
                if(j%2==0)
                {
                    System.out.print("0 ");
                }
                else{System.out.print("1 ");

                }
            }
            System.out.println();
        }
    }
}
