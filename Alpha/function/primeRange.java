import java.util.*;

public class primeRange {
    public static boolean isprimeF(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void Primerangeu(int n) {
        for (int i = 2; i <= n; i++) {
            if (isprimeF(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Primerangeu(500);
    }
}
