import java.util.*;
public class characterpattern {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number :");
        int n = sc.nextInt();
        char ch ='A';
        for(char i = 1 ; i<=n ; i++)
        {
            
            for(char j =  1 ; j<=i ; j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
