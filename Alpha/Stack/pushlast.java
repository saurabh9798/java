import java.util.*;
public class pushlast {
    public static void pustlast(Stack<Integer> s,int data)
    {
        if (s.size()==0) {
            s.push(data);
            return ;
        }
        int top = s.pop();
        pustlast(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s);
        pustlast(s, 5);
        // while (s.size() != 0) {
        //     System.out.println(s.pop());
        // }
        System.out.println(s);
    }
}
