import java.util.*;
public class numbertraingle1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number :");
        int n = sc.nextInt();
        int num =1;
        for(int i=1;i<=n;i++)
        {
            for(int j = 1; j<=i ; j++)
            {
                System.out.print(num +" ");
                num++;
            }
            System.out.println();
        }
    }
}
