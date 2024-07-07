//Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever
import java.util.*;
public class fevercheck {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your current body temperature :");
        float temp = sc.nextFloat();
        if (temp > 100)
        {
            System.out.print("you have ferver on the temperature of :"+temp);
        }
        else
        {
            System.out.print("you don't have fever on the temperature of :"+temp);
        }

    }
}