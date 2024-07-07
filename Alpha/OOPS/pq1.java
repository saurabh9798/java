import java.util.*;
class complex {
    int real;
    int imag;
    public complex (int r,int i) {
        real =r;
        imag = i;
    }
    public static complex add (complex a, complex b) {
        return new complex((a.real + b.real), (a.imag + b.imag));
    }
    public static complex diff(complex a, complex b) {
        return new complex((a.real - b.real), (a.imag - b.imag));
    }
    public static complex product(complex a,complex b) {
        return new complex(((a.real*b.real) - (a.imag * b.imag)), ((a.real*b.imag)+ (a.imag *b.real)));
    }

public void printcomplex() {
    if (real == 0 && imag != 0) {
        System.out.println(imag + " i");
    }
    else if (imag == 0 && real != 0) {
        System.out.println(real);
    }
    else {
        System.out.println(real + "+" +imag + "i");
    }
}
}
class pq1 {
    public static void main(String[] args) {
        complex c = new complex(4, 5);
        complex d = new complex(9, 4);


        complex e = complex.add(c, d);
        complex f = complex.diff(c, d);
        complex g = complex.product(c, d);

        e.printcomplex();
        f.printcomplex();
        g.printcomplex();
    }
}