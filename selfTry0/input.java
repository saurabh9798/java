import java.io.*;
import java.util.*;

public class input {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    for(int i=1; sc.hasNextLine();i++){
        System.out.println(i+" "+sc.nextLine());
    }
  }
}
