import java.util.*;
public class swap {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        int temp = 0;
        System.out.println(list);
        int idx1 = 1, idx2 =3;
        temp = list.get(1);
        list.set(1,list.get(2)) ;
        list.set(2,temp) ;
        System.out.println(list);

    }
}
