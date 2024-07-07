// In a program, input the side of a square. You have to output the area of the
// square.
import java.util.*;
public class arcSquare {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of side :");
        int side = sc.nextInt();
        String c = sc.nextLine();
        int area = side*side;

        System.out.println(area);
    }
}