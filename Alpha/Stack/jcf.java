import java.util.Collections;
import java.util.Stack;
public class jcf {
    public static void main(String[] args) {
        System.out.println("using java collection framework ");
        Stack <Integer> jcf = new Stack<>();
        jcf.push(1);
        jcf.push(2);
        jcf.push(3);
        jcf.push(4);
        while (!jcf.isEmpty()) {
            System.out.print(jcf.peek());
            jcf.pop();
        }
    }    
}
