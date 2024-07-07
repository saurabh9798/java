import java.util.*;

public class pq {
    public static int vowel0(String str) {
        
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("the no of lowercase vowel entered by the user :" + count);
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.print("Enter any string ");
        String str = sc.nextLine();
        vowel0(str);

    }
}
