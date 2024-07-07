import java.util.*;
public class continue2 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number :");
        int n = sc.nextInt();
        for(int i = 1 ; i<=n ;i++)
        {
            if(i%10==0)
            {
                continue;
            }
            System.out.print(i+"\n");
        }
    }
}
