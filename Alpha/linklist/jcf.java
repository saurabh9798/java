// jcf means java colections framework 
// here we use all java collections framework 
import java.util.LinkedList;
public class jcf {
    public static void main(String[] args) {
        // create 
        LinkedList <Integer> ll =new LinkedList<>();
        // add first 
        ll.addFirst(5);
        ll.addFirst(2);
        ll.addFirst(4);
        // add last 
        ll.addLast(8);
        ll.addLast(11);
        ll.addLast(9);
        // print 
        System.out.println(ll);
        // remove 
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}
