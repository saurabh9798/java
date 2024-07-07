/*Given two array A and B of equal length n. pair each element of array A to an element 
 * in array B ,such that sum S of absolute difference of all the pairs is minimum 
 */

import java.util.Arrays;

public class MinAbsoluteDifference {
    public static void main(String[] args) {
        int A[] = {1,2,3};
        int B[]= {2,1,3};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;

        for (int i = 0; i < A.length; i++) {
            minDiff += Math.abs(A[i]-B[i]);
        }
        System.out.println("min absolute diff of pairs = "+ minDiff);
    }
}
