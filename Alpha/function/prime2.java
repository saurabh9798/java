import java.util.*;
public class prime2
{
    public static boolean isprimeF(int n)
    {
        if(n==2)
        {
            return true;
        }
        for(int i =2;i<=Math.sqrt(n);i++)
        {
            if (n%i==0)
             {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        System.out.print(isprimeF(2));
    }
}
