public class Overriding {
    public static void main (String args[])
    {
        Deer d = new Deer();
        d.eat();
    }
}
class Animal {
    void eat() {
        System.out.println("Eat anything");
    }
}
class Deer extends Animal {
    void eat() {
        System.out.println("eat grass");
    }
}