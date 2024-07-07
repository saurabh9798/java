public class powwer {
    public static int powr(int x,int n)
    {
        if (n==0) {
            return 1;
        }
        return x*powr(x, n-1);
    }
    public static int optimisePwr(int a,int n)
    {
        if (n==0) {
            return 1;
        }
        int halfpowersq = optimisePwr(a, n/2) * optimisePwr(a, n/2);
        if (n%2 != 0) {
            halfpowersq = 2*halfpowersq;
        }
        return halfpowersq;
    }
    public static void main(String[] args) {
        System.out.println("the power of x to n is "+powr(2, 5));
        System.out.println("the optimise power of x to n is "+optimisePwr(2, 4));
    }
}
