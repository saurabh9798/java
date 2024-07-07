import java.util.*;
public class basic2d {
    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (key == matrix[i][j]) {
                    System.out.print("key is found :(" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("key not found ");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of row :");
        int m = sc.nextInt();
        System.out.print("Enter no of column :");
        int n = sc.nextInt();
        System.out.println("input all element of this matrix are :");
        int matrix[][] = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();

            }
        }
        System.out.println("the final all output element of this matrix are :");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);

            }
            System.out.println();
        }
        search(matrix, 10);
    }
}
