public class reverse {
    public static void main(String args[])
    {
        int i = 875624;
        while (i>0)
        {
            int ls = i%10;
            System.out.print(ls);
            i = i/10;
        }
    }
}
