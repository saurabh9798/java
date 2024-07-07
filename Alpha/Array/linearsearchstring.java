import java.util.*;
public class linearsearchstring {
    public static int food0(String food[],String key)
    {
        for(int i=1;i< food.length;i++)
        {
            if (food[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        String food[]={"bread","butter","milk","pasta","maggi","chowmin"};
        String key = "chapati";
        int index = food0(food,key);
        if (index == -1) {
            System.out.print("not found");
        }
        else{
            System.out.print("Key is at index : "+index);
        }
    }
}
