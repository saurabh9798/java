public class Binomial {
    public static int factf(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static int bincoff(int n, int r) {
        int fact_n = factf(n);
        int fact_r = factf(r);
        int factnmr = factf(n - r);

        int bincoff = fact_n / (fact_r * factnmr);
        return bincoff;
    }

    public static void main(String args[]) {
        System.out.println(bincoff(5, 2));
    }
}
