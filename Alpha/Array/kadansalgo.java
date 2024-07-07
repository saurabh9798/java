import java.util.*;

public class kadansalgo {
    public static void kadans(int numb[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < numb.length; i++) {
            cs = cs + numb[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("our max subarray sum is : " + ms);
    }

    public static void main(String[] args) {
        int numb[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadans(numb);

    }
}
