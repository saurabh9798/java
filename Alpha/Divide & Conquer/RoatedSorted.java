// input : sorted rotated array with distnct number (in ascending order) it is rotated at a pivot point . find the index of given element 
public class RoatedSorted {
   public static int search(int arr[], int target, int si, int ei) {
      // base case
      if (si > ei) {
         return -1;
      }
      // kaam
      int mid = si + (ei - si) / 2; // mid = si+ei;
      // case found
      if (arr[mid] == target) {
         return mid;
      }
      // mid on l1
      if (arr[si] <= mid) {

         // case a left
         if (arr[si] <= target && target <= arr[mid]) {
            return search(arr, target, si, mid - 1);
         } else {
            // case b :right
            return search(arr, target, mid + 1, ei);
         }
      }
      // mid on l2
      else {
         // case c : right
         if (arr[mid] <= target & target <= arr[ei]) {
            return search(arr, target, mid + 1, ei);
         } else {
            // case d : left
            return search(arr, target, si, mid - 1);
         }
      }

   }

   public static void main(String args[]) {
      int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
      int tarx = search(arr, 6, 0, arr.length - 1);
      System.out.print(tarx);
   }
}
