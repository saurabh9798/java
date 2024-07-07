public class pq2 {

    public int search(int arr[], int target) {
        int min = minSearch(arr);
        if (arr[min] <= target && target <= arr[arr.length - 1]) {
            return search(arr, min, arr.length - 1, target);
        } else {
            return search(arr, 0, min, target);
        }
    }
    public int search(int[] arr, int left, int right, int target) {
        int l = left;
        int r = right;
        while (l <= r) {
            int mid = 1 + (r - 1) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }
    public int minSearch(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = left + ((right - left) / 2);
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return right;

    }

    public static void main(String[] args) {
        // int arr[] = { 3, 2, 8, 21, 7, 30 };
        // search
    }
}
