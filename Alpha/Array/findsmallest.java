import java.util.*;
public class findsmallest {
    public static int smallest(int arr[])
    {
        int small = Integer.MAX_VALUE;
        int big = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if (arr[i]<small) {
                small = arr[i];
            }
            if (arr[i]> big) {
                big = arr[i];
            }
        }
        return small;
    }
    public static void main(String[] args) {
        int arr[]={10,12,10,17,18,90,54,15,61,4,12,10,19};
       System.out.println(smallest(arr));
    }
}
