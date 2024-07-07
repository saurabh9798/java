import java.util.*;

public class lonelynumber {
    public static void printlonelynumber(int arr[], int n) {
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                if (arr[i + 1] - arr[i] > 1) {
                    System.out.println(arr[i]);
                }
            } else if (i == n - 1) {
                if (arr[i] - arr[i - 1] > 1) {
                    System.out.println(arr[i]);
                }
            } else {
                if (arr[i + 1] - arr[i] > 1 && arr[i] - arr[i - 1] > 1) {
                    System.out.println(arr[i]);
                }
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 9, 3, 1, 2 };
        printlonelynumber(arr, 5);
    }
}