import java.util.*;

public class rainwtrtrapped {
    public static int trappedRainWater(int height[]) {
        int n = height.length;
        // left max height
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // right max height
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        // trapped water
        int trappedWtr = 0;
        for (int i = 0; i < n; i++) {
            int waterlavel = Math.min(leftMax[i], rightMax[i]);
            trappedWtr += waterlavel - height[i];
        }
        return trappedWtr;
    }

    public static void main(String args[]) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println("the water trapped is : = " + trappedRainWater(height));
    }
}
