public class constructor {
    public static void main(String[] args) {
    //    student s2 = new student("saurabh");
    //     student s3 = new student(125);
        student s1 = new student(); 
        s1.name = "saurabh";
        s1.roll = 685;
        s1.password = "hedvc";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        student s2 = new student(s1);
        s2.password = "iwhd";

        s1.marks[2] = 110;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

    }   
}
 
class student{
    String name;
    int roll;
    String password;
    int marks[];
    class address {
        String city;
    }
//shallow copy constructors
    // student(student s1)
    // {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }
    // deep copy constructor
    student (student s1)
    {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }   
    }
     
    student()
    {
        marks = new int[3];
        System.out.println("constructors is called...");
    }
    student(int roll)
    {
        marks = new int[3];
        this.roll = roll;
    }
    student(String name){
        marks = new int[3];
        this.name = name;
    }
}