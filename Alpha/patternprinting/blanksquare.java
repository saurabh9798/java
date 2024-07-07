import java.util.*;
public class blanksquare {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number :");
        int n = sc.nextInt();
        int row = 1;
        while(row<n)
        {
            if(row == 1 || row == n-1)
            {
                for(int i = 0; i< n; i++){
                System.out.print("* ");
                }
            }
            else{
                System.out.print("*  ");
                for(int i = 0 ; i< n-2;i++)
                {
                    System.out.print(" ");
                }
                System.out.print("  *");
            }
            System.out.println();
            row++;
        }

    }
}
