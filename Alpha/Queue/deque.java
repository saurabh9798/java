import java.util.*;
public class deque {
    public static void main(String[] args) {
        Deque<Integer> deque1 = new LinkedList<>();
        deque1.addFirst(1);
        deque1.addFirst(2);
        deque1.addLast(3);
        deque1.addLast(4);
        System.out.println(deque1);
        // deque1.removeFirst();
        // System.out.println(deque1);
        // deque1.removeLast();
        // System.out.println(deque1);
        System.out.println("first element is = "+deque1.getFirst());
        System.out.println("last element is = "+deque1.getLast());
    }
}
