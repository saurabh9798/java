public class monotonicArray {
    public static boolean isIncreasing(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDecreasing(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean ismonotonic(int arr[], int n) {
        boolean isIncreasing = isIncreasing(arr, n);
        boolean isDecreasing = isDecreasing(arr, n);
        return isIncreasing || isDecreasing;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 14, 121, 128 };
        System.out.println(ismonotonic(arr, 4));
    }
}
