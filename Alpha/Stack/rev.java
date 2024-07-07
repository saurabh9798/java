import java.util.*;
public class rev {
    public static void lastpush(Stack<Integer> s,int val)
    {
        if (s.size()==0) {
            s.push(val);
            return ;
        }
        int top = s.pop();
        lastpush(s, val);
        s.push(top);
    }
    public static void rev0(Stack<Integer> s)
    {
        if (s.size()==0) {
            return;
        }
        int top = s.pop();
        rev0(s);
        lastpush(s, top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        for (int i = 10; i <= 50; i=i+10) {
            s.push(i);
        }
        System.out.println(s);
        lastpush(s, 5);
        System.out.println(s);
        rev0(s);
        System.out.println(s);
    }
} 
