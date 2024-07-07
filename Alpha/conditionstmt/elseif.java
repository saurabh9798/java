import java.util.*;
public class elseif{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age :");
        int n = sc.nextInt();
        if(n<13)
        {
            System.out.print("your are child");
        }
        else if(n>12 && n<20)
        {
            System.out.print("your are teen ageer");
        }
        else if ( n> 19 && n<40)
        {
            System.out.print("you are adult");
        }
        else
        {
            System.out.print("you are old");
        }
    }
}