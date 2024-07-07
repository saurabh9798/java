import java.util.*;
public class tryx {

    public static void main(String[] args) {
        int ts = 0;
        int maxsum = Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE;
        int arr[] ={1,-2,6,-1,3};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i ; j < arr.length; j++) {
                int sum = 0;
                for (int start = i; start <= j; start++) {
                    System.out.print(arr[start]+" ");
                    ts++;
                    sum = sum + arr[start];
                    if (maxsum< sum) {
                        maxsum = sum;
                    }
                    if (minsum>sum) {
                        minsum = sum;
                    }
                }
                System.out.print("the sum of subarrayn is "+ sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("the number of total subarray is : "+ ts);
        System.out.println("max sum of subarray : "+ maxsum);
        System.out.println("min sum of subarray : "+ minsum);
    }
}  