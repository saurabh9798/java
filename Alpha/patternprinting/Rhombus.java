import java.util.*;
public class Rhombus {
    public static void solid_rhombus(int row){
        for(int i = 1; i<= row;i++)
         {
            // for(int j = row;j>i;j--)
            // {
            //     System.out.print(" ");
            // }
            for(int j =1;j<=(row-i);j++)
            {
                System.out.print(" ");
            }
            for(int j = 1;j<=row;j++)
            {
                System.out.print("*");
            }
            System.out.println();
         }
    }
    public static void hollow_rhombus(int row)
    {
        for(int i=1;i<=row;i++)
        {
            for(int j =1;j<=(row-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=row;j++)
            {
                if (j==1||j==row||i==1||i==row)
                 {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        //  solid_rhombus(6);
        hollow_rhombus(5);
    }
    
}
