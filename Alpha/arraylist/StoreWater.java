import java.util.*;
public class StoreWater {
    public static int waterstore(ArrayList<Integer>height)
    {
        int maxwtr = 0;
        // brute force code 
        for (int i = 0; i < height.size(); i++) {
            for (int j = i+1; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int width = j-i;
                int currWtr = ht*width;
                maxwtr = Math.max(maxwtr, currWtr);
            }
            
        }
        return maxwtr;
    }
    public static int waterstore0(ArrayList<Integer>height)
    {
        int maxwtr = 0;
        int lp =0;
        int rp = height.size()-1;

        while (lp<rp) {
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp-lp;
            int currWtr = ht*width;
            maxwtr = Math.max(maxwtr, currWtr);

            // update ptr
            if (height.get(lp)<height.get(rp)) {
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxwtr;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        //1,8,6,2,5,4,8,3,7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(waterstore0(height));
    }
}