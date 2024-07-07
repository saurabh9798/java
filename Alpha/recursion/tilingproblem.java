// given "2*n" floor and tiles of size "2*1", count ther number of ways to tile the given floor using the 2*1 tiles (a tiles can either be placed horizontally or verticallty.)
public class tilingproblem {
    public static int printTile(int n)
    {
        // base case
        if (n==0 || n==1) {
            return 1;
        }
        // kaam 
        // vertical choice 
        int fnm1 = printTile(n-1);

        // horizontal choice
        int fnm2 = printTile(n-2);

        int totalways = fnm1+fnm2;
        return totalways;
    }
    public static void main(String[] args) {
        System.out.println(printTile(4));
    }
}
