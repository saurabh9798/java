import java.util.ArrayList;
public class basic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();
        // add operation 
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list1.add("saurabh");

        list.add(2,9);
        System.out.println(list);

        // get operation 
        // int element = list.get(2);
        // System.out.println(element);

        // delete element 
        // list.remove(2);
        // System.out.println(list);

        // set operation // set element at index 
        // list.set(3, 8);
        // System.out.println(list);

        // contain element means element exist or not 

      
        // System.out.println(list.contains(5));
        // System.out.println(list.contains(41));

        // size of arraylist 
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }

       

    }
}
