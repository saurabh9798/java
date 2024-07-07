import java.util.*;
public class numberpalinfrome {
    public static void numberpalinfromePattern(int row)
    {
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=row-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>1;j--)
            {
                System.out.print(j);
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        numberpalinfromePattern(6);
    }
}
