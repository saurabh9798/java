public class Linklist {
    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    static Node head;
    static Node tail;

    static void addLast(int data) {
        // create a node 
        Node nn = new Node(data);
        
        // connect to tail
        tail.next = nn;

        // update tail
        tail = nn;
    }
    public static void printLL() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");

            // Node tempKNext = temp.next;

            // temp = tempKNext.next; 
            temp = temp.next;
        }
    }

    public static Node getNodeAt(int idx) {
        Node temp = head;
        int currentIdx = 0;

        while (currentIdx < idx) {
            temp = temp.next;
            currentIdx++;
        }
        return temp;
    }
    public static void addAt(int data,int idx)
    {
        // create a Node 
        Node currentNode = new Node(data);

        // get idx-1 Node 
        Node prev = getNodeAt(idx-1);

        // get after node 
        Node afterNode= prev.next;

        // join to prev to current node 
        prev.next = currentNode;
        currentNode.next = afterNode;
    }
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(15);
        Node n3 = new Node(20);
        n1.next = n2;
        n2.next = n3;
        
        head= n1 ;
        tail = n3;

        addLast(25);
        // addLast(27);
        // addLast(30);
        System.out.println("previous ");
        printLL();
        addAt(19, 2);

        System.out.println("previous ");

        printLL();
    }
}
