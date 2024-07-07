import java.util.*;

public class basicoops {

    public static void main(String args[]) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Saurabh kumar";
        myAcc.setpassword("abcdefghi");
    }
}
class BankAccount{
    public String username;
    private String password;
    public void setpassword(String pwd)
   {
    password = pwd;
    } 
}
 