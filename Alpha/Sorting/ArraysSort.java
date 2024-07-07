import java.util.*;

public class ArraysSort {
    public static void printarr(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Integer arr[] = { 5, 4, 1, 3, 2 };
        // Arrays.sort(arr); it is used to sort the array in accending manner
        // Arrays.sort(arr,2,5); //it is also used to sort the array but we can sort
        // this by starting and ending index
        // Arrays.sort(arr,Collections.reverseOrder()); it is use sort the array for
        // descnding order
        Arrays.sort(arr, 1, 4, Collections.reverseOrder()); 
        // its also se for sort the array in descnding order 
        printarr(arr);

    }
}
