// Find numbers of ways to reach from (0,0) to (n-1,m-1) ti a n*m grid. 
// allowed moves - right or down 
public class grid {
    public static int gridways(int i,int j,int n,int m)
    {
        if (i==n-1 && j== m-1) { //condition for last cell
            return 1;
        }
        else if(i==n || j==n) // boundery cross condition 
        {
            return 0;
        }
        int way1 = gridways(i+1, j, n, m); 
        int way2 = gridways(i, j+1, n, m);  
        return way1+way2;
    }
    public static void main(String[] args) {
        int n=3,m=3;
        
        System.out.println(gridways(0, 0, n, m));
    }
}
 