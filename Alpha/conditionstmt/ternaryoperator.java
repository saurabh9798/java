import java.util.*;
public class ternaryoperator{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number :");
        int n = sc.nextInt();
        String type = ((n%2)==0)?"even number ":"odd number ";
        System.out.print(type);
    }
}