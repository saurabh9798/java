public class methodOverloding {
    public static void main (String args[])
    {
        Calculator calc = new Calculator();
        System.out.println(calc.sum((float)5.8, (float)7.9));
        System.out.println(calc.sum(5, 7));
        System.out.println(calc.sum(5, 7,8));
    }
}
class Calculator {
    int sum(int a,int b)
    {
        return a+b;
    }
    float sum(float a,float b)
    {
        return a+b;
    }
    int sum(int a,int b, int c)
    {
        return a+b+c;
    }
}
