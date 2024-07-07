public class unaryOperator {
    public static void main(String args[]) {
        int a = 10;
        int b = 10;
        int c = 10;
        int d = 10;
        int p = ++a;
        int q = b++;
        int r = --c;
        int s = d--;
        System.out.println("pre incresement :"+p);
        System.out.println("post incresement :"+q);
        System.out.println("pre decresement :"+r);
        System.out.println("post decresement :"+s);
    }
} 