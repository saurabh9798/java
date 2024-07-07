import java.util.*;

public class maxsumSubarray {
    public static void sumofsubarray(int arr[]) {
        int sum = Integer.MIN_VALUE;
        int currsum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currsum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");

                    currsum += arr[k];

                }
                if (currsum > sum) {
                    sum = currsum;
                }
                System.out.println();
                System.out.println("the sum of array is : " + currsum);

            }
            System.out.println();

        }
        System.out.print("the max sum is : " + sum);
    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 6, 8, 10 };
        sumofsubarray(arr);
    }
}