public class palindrome {
    public static boolean isPalindrome(int x)
    {
        for (int i = x; i > 0 ; i++) {
            if (x == i) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int x = 12251;
        // System.out.println(isPalindrome(x));
        for (int i = 0; i < '\0'; i++) {
            // System.out.println(x[i]);
        }
    }
}
