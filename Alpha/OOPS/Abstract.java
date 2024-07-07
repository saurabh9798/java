public class Abstract {
    public static void main(String args[])
    {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c =new Chicken();
        c.eat();
        c.walk();
        System.out.println(h.color);
        Mustang myHorse = new Mustang();
    }
}
abstract class Animal {
    String color;
    Animal()
    {   
        System.out.println("animal constructor called");
        color = "brown";
    }
    void eat() {
        System.out.println("animal eats");
    }
      abstract void walk();
}
class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor called");
    }
    void changeColor() {
        color = "dark brown";
    }
    void walk() {
        System.out.println("walks on 4 legs");
    }
}
class Mustang extends Horse {
    Mustang (){
        System.out.println("Mustang constructor called");
    }
}
class Chicken extends Animal {
    void changeColor(){
        color = "yellow";
    }
    void walk() {
        System.out.println("walk on 2 legs");
    }
}