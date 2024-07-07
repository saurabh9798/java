public class diagonal {
    public static int diagonalsum(int matrix[][]) {
        // first approach to solve this question
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j || i + j == matrix.length - 1) {
                    sum = sum + matrix[i][j];
                }
                // elseif(i)
            }
        }
        // System.out.println("the sum of diagonal is :"+sum);
        return sum;
    }

    public static int diagonalsum0(int matrix[][]) {
        // second approach to solve this question
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum = sum + matrix[i][i];
            if (i != matrix.length - 1 - i)
                sum = sum + matrix[i][matrix.length - i - 1];
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        System.out.println(diagonalsum(matrix));
        System.out.println(diagonalsum0(matrix));
    }
}
