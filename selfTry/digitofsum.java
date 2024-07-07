import java.util.*;
public class digitofsum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number :");
        int n = sc.nextInt();
        int temp = 0;
        while (n != 0) {

            int ls = n % 10;
            temp =  temp + ls;
            n = n / 10;
        }
        System.out.print("the sum of total number is :" + temp);
    }
}