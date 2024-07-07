import java.util.ArrayList;
public class StackBasic {
    /*
     * ************implementation of stack using arraylist*********************
     */
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }
        // push 
        public static void push(int data) {
            list.add(data);
        }

        // pop 
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        // peek 
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size()-1); 
        }
    }
    /*
     * ********* implementation of stack using linkedlist ********************
     */
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static class stackL {
        static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        // push 
        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return ;
            }
            newNode.next = head;
            head =newNode;
        }
        // pop 
        public static int pop()
        {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        // peek 
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            return top;
        }
    }
    public static void main(String args[]) {
        // using arraylist 
        System.out.println("***************using arraylist ****************");
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while (!s.isEmpty()) {
            System.out.print(s.peek());
            s.pop();
        }
        System.out.println();
        System.out.println("*******using linked list **********");
        // using linkedlist 
        stackL ss = new stackL();
        ss.push(1);
        ss.push(2);
        ss.push(3);
        ss.push(4);
        while (!ss.isEmpty()) {
            System.out.print(ss.peek());
            ss.pop();
        }

        
    }
}
