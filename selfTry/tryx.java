class tryy {
    public void transpose(int n, int a[][]) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = 4;
        int a[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
        transpose(n, a);
    }
}