public class matrixspiral {
    public static void printsprial(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;

        int sc = 0;
        int sr = 0;
        int er = n - 1;
        int ec = m - 1;

        int row = 0;
        int col = 0;

        while (sc <= ec && sr <= er) { // till when my range is valid 
            // col downwards --> printing starting column 
            col = sc;
            for (row = sr; row <= er; row++) {
                System.out.print(arr[row][col] + " ");
            }
            sc++;
            // row towards right 
            row = er;
            for (col = sc; col <= ec; col++) {
                System.out.print(arr[row][col] + " ");
            }
            er--;
            // col upwords 
            col = ec;
            for (row = er; row >= sr; row--) {
                System.out.print(arr[row][col] + " ");
            }
            ec--;
            // row towards 
            row = sr;
            for (col = ec; col >= sc; col--) {
                System.out.print(arr[row][col] + " ");
            }
            sr++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 },{7,8,9} };
        printsprial(arr);
    }
}
