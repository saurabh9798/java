import java.util.*;

public class dimand {
    // two different approch to solve this question 
    public static void dimand0(int row)
    {
        for (int i = 1; i <= row; i++) {
            for(int j =1;j<=(row-i);j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for(int j =1;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = row-1; i >= 1; i--) {
            for(int j =1;j<=(row-i);j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for(int j =1;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void dimand1(int row)
    {
         for (int i = 1; i <= row; i++) {
            for(int j =1;j<=(row-i);j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
         for (int i = row-1; i >= 1; i--) {
            for(int j =1;j<=(row-i);j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        // dimand0(4);
        dimand1(4);
    }
}
