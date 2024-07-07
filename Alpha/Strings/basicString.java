import java.util.*;
public class basicString {
    public static void printletter(String str)
    {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        // System.out.println(name);
        // System.out.println(name.length());
        // concatination 
        String Fname = "saurabh";
        String Lname = "kumar";
        String FullName = Fname+" "+Lname;
        System.out.println(FullName);
        System.out.println(FullName.charAt(4));
        printletter(FullName);
    }
}
