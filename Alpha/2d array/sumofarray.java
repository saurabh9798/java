public class sumofarray {
    public static void arraysum(int nums[][]) {
        int sum = 0;
        // for (int i = 0; i < nums.length; i++) {
        // for (int j = 0; j < nums[0].length; j++) {
        // if (i == 1) {
        // System.out.print(nums[i][j]+" ");
        // sum+=nums[i][j];
        // }
        // }
        // }
        // System.out.println();
        // System.out.print("the sum of array is :"+sum);
        // second approches to solve sum of 2nd row elements
        for (int j = 0; j < nums[0].length; j++) {
            sum += nums[1][j];
        }
        System.out.println("Sum is : " + sum);
    }
    public static void main(String[] args) {
        int nums[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        arraysum(nums);
    }
}
