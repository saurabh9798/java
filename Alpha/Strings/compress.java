import java.util.*;

public class compress {
    public static String compress0(String str) {
        String newstr = "";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newstr += str.charAt(i);
            // str.append()
            if (count > 1) {
                newstr += count.toString();
            }
        }
        return newstr;
    }
    public static String compress1(String str)
    {
        String ans =""+str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if (curr==prev) {
                count++;
            }
            else
            {
                if (count>1) {
                    ans += count;
                    // System.out.println(ans);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "aaaabbbcccccdd";
        System.out.println(compress0 (str));
    }
}
