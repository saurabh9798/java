// Write a Java program to input week number(1-7) and print day of week name using switch case
import java.util.*;
public class weekname {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of week :");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.print("Monday");
                break;
        
            case 2:
                System.out.print("Tuesday");
                break;
        
            case 3:
                System.out.print("Wednesday");
                break;
        
            case 4:
                System.out.print("Thrusday");
                break;
        
            case 5:
                System.out.print("Friday");
                break;
        
            case 6:
                System.out.print("Saturday");
                break;
            case 7:
                System.out.print("Sunday");
                break;
        
            default: 
            System.out.print("Day not exist or invalid day ");
                break;
        }
    }
}