public class swap {
    public static void swap0(int a,int b)
    {
         a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(" After swapping the value of a is : "+a+" and the value of b is : "+b);
    }
    public static void swap1(int x,int y)
    {
        System.out.println("Before Swapping the value of a is :" +x+" and b is : "+y);
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println("After Swapping the value of a is :" +x+" and b is : "+y);

    }
    public static void main(String[] args) {
    //    swap0(5, 7);
            swap1(3,4);
    }
}
