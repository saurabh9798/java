/*
 * we are given an infinite supply of denomnation[1,2,5,10,20,50,100,500,2000]
 * Find min no of coins/notes to make change for a value v.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class indianCoin {
    public static void main(String[] args) {
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 200,500,1000, 2000 };

        Arrays.sort(coins, Comparator.reverseOrder());

        int countofcoins = 0;
        int amount = 1799;
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    countofcoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }

            }
        }
        System.out.println("total (min) coins used = "+ countofcoins);

        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i)+" ");
        }
        System.out.println();
    }
}
