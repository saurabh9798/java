// find if any pair in a sorted & roatated arraylist has a target sum 
import java.util.*;
public class rotated {
    public static boolean pairsum(ArrayList<Integer> list, int target)
    {
        int bp = -1;
        int n= list.size();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)> list.get(i+1)) {
                bp =i;
                break;
            }
        }
        int lp = bp+1; // smallest
        int rp = bp; // largest 

        while (lp != rp) {
            // case 1
            if (list.get(lp)+list.get(rp)==target) {
                return true;
            }
            // case 2;
            if (list.get(lp)+list.get(rp)<target) {
                lp = (lp+1) %n;
            }
            else
            {
                rp = (n+rp-1) %n;

            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println(pairsum(list, 25));
    }
}
