import java.util.*;
public class dublicteParentheses {
    public static boolean isduplicate(String str)
    {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // closing 
            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count<1) {// duplicate 
                    return true;
                }
                 else{// opening 
                    s.pop(); 
                 }
            } 
             else {
                s.push(ch); // opening pair 
            }  
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "((a+b))"; // true
        String str2 ="(a-b)"; // false 
        System.out.println(isduplicate(str));
    }
}
