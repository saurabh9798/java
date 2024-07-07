import java.util.*;
public class reverse {
    public static void main(String args[])
    {
        String str = "hii i am saurabh";
        char ch; 
        String nstr = "k";
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            nstr =  ch + nstr ;
        }
       System.out.print( nstr); 
    }
}
