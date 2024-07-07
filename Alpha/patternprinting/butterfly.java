import java.util.*;

public class butterfly {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number :");
        int n = sc.nextInt();
        int star = 1;
        int blank = n - 2;
        for (int row = 1; row <= n; row++) {
            // star
            for (int j = 0; j <= star; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <= blank; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (row < (n / 2)) {
                star++;
                blank = blank-2;
                row++;
            }
            else if (row == (n / 2))
             {
                row++;
            } 
            else 
            {

                star--;
                blank = blank+2;;
            }
        }
    }
}
