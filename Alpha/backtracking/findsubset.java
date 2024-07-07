public class findsubset {
    public static void FindSubSet(String str,String ans,int i)
    {
        // base case 
        if (i== str.length()) {
           if (ans.length() == 0) {
                System.out.println("null");
           }
           else
           {
            System.out.println(ans);
           }
            return ;
        }
        // yes choice 
        FindSubSet(str, ans+str.charAt(i), i+1);
        // no choice 
        FindSubSet(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        FindSubSet(str, "", 0);
    }
}
