import java.util.*;
public class hollowrectangle {
    public static void hollow_rectangle(int row ,int column){
        for(int i=1;i<=row;i++)
        {
            for(int j = 1 ; j<=column ;j++)
            {
                if (i==1 || j==1 ||i==row ||j==column) {
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
    public static void main(String args[])
    {
        hollow_rectangle(5, 8);
    }
}
