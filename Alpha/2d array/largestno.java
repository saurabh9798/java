import java.util.*;
public class largestno {
    public static void greatestNo(int matrix[][]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                // first approach to solve this question
                // if (max < matrix[i][j]) {
                // // max = matrix[i][j];
                // }
                // second approach to solve this question
                max = Math.max(max, matrix[i][j]);
            }
        }
        System.out.println("the greatest no is :" + max);
    }
    public static void smallestno(int matrix[][]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                // first approach to solve this question
                // if (min>matrix[i][j]) {
                // min = matrix[i][j];
                // }
                // second approach to solve this question
                min = Math.min(min, matrix[i][j]);
            }
        }
        System.out.print("the smallest no is :" + min);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row :");
        int m = sc.nextInt();
        System.out.print("Enter the column :");
        int n = sc.nextInt();
        int matrix[][] = new int[m][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        greatestNo(matrix);
        smallestno(matrix);
    }
}