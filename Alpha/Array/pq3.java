import java.util.*;
// first approach to solve this question 
public class pq3 {
    public static int stockpre(int arr[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int max_profit = max - min;
        System.out.println("the maximum profit is : " + max_profit);
        return max;
    }
    // second approach to solve this question
    public static int maxProfit(int[] arr) {
        int buy = arr[0];
        int profit_ = 0;
        for (int i = 1; i < arr.length; i++) {
            if (buy < arr[i]) {
                profit_ = Math.max(arr[i] - buy, profit_);
            } else {
                buy = arr[i];
            }
        }
        return profit_;
    }
    public static void main(String[] args) {
        int arr[] = { 5, 4, 8, 6, 9, 18 };
        // stockpre(arr);
        System.out.println(maxProfit(arr));
    }
}
