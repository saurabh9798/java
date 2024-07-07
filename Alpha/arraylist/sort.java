import java.util.*;
public class sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.println("before sort :"+list);
        Collections.sort(list);
        System.out.println("after assending sort : "+list); // acending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("After desecending sort"+list);
    }
}
