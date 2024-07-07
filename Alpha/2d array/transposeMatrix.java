public class transposeMatrix {
    public static int[][] transposeM(int matrix[][]) {
        int n = matrix.length;
        int m = matrix[0].length;
        int ans[][] = new int[m][n];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                ans[i][j] = matrix[j][i];
            }
            System.out.println();
        }
        return ans;
    }
    public static void main(String[] args) {
        int matrix[][] = { { 2, 3, 7 }, { 4, 6, 7 } };

        int ans[][] = transposeM(matrix);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
}
