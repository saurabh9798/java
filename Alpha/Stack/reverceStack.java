import java.util.*;
public class reverceStack {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static void stackReverxce(Stack<Integer> s) {
        if (s.empty()) {
            return ;
        }
        int top = s.pop();
        stackReverxce(s);
        pushAtBottom(s, top);
    }
    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.print(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);
        stackReverxce(s);
        printStack(s);
    }
}