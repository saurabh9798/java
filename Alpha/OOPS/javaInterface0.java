public class javaInterface0 {
    public static void main(String args[])
    {
        // Queen q = new Queen();
        // q.moves();
        // King k = new King();
        // k.moves();
        Rook r = new Rook();
        r.moves();
    }
}
interface checkplayer {
    void moves();
}
class Queen implements checkplayer {
    public void moves() {
        System.out.println("up ,down , left , diagonal(in all 4 direction )");
    }
}

class Rook implements checkplayer {
    public void moves() {
        System.out.println("up ,down,left ,rigth");
    }
}
class King implements checkplayer {
    public void moves() {
        System.out.println("up,down,left,right,diagonal ~ (by one step)");
    }
}
 // practicing a interface question 

interface Herbivore {
    // void eatMeat();
}
interface carnivor {
    // void doNotEatMeat();
}
class Bear implements Herbivore,carnivor {
    
} 