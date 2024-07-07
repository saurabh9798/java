public class inheritence {
    public static void main(String args[])
    {
        fish shark = new fish();
        shark.eat();
        Dog dobby = new Dog();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    }
}
/**
 * Innerinheritence
 */
// base class
class animal {
    String color;
    void eat() {
        System.out.println("eats");
    }
    void breathe()
    {
        System.out.println("breathes");
    }
}
class Mammel extends animal{
    void walk() {
        System.out.println("walks");
    }
}
class Fish extends animal{
    void swim() {
        System.out.println("swim");
    }
}
class Bird extends animal{
    void Fly() {
        System.out.println("Fly");
    }
}

class Dog extends Mammel {
    String breed;
}
// derived class 
class fish extends animal {
    int fins;
    void swim() {
        System.out.println("swims in water");
    }
}