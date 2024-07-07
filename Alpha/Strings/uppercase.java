import java.util.*;
public class uppercase {
    public static String touppercase(String ch)
    {
        StringBuilder sb = new StringBuilder("");
        char str = Character.toUpperCase(ch.charAt(0));
        sb.append(str);
        for (int i = 1; i < ch.length(); i++) {
            if (ch.charAt(i) == ' ' && i<ch.length()-1) {
                sb.append(ch.charAt(i));
                i++;
                sb.append(Character.toUpperCase(ch.charAt(i)));
            } else {
                sb.append(ch.charAt(i));
            }
        }  
        return sb.toString(); 
    }
    public static void main(String[] args) {
        String ch = "hi i am saurabh";
        // System.out.println("Original string is : "+ch);
        // System.out.println("uppercase string are "+ch.toUpperCase());
        System.out.println(touppercase(ch));
    }
}
