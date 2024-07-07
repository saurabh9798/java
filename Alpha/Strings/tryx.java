import java.util.*;

public class tryx {
    public static boolean palindrome2(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n-1-i)) {
                return false;
            }
        }
        return true;
    }
    public static string ascii(string str)
    {
        System.out.println(str);
        return str;
    }
    public static void main(String args[]) {
        // String str = "saurabh";
        // System.out.println(palindrome2(str));
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        str.reverse();
        System.out.print(str);
    }
}