class Pen{
    // DATA MEMBERS OF PEN / Properties
    String color;
    String brand;
    String type;
    // MEMBER FUNCTION OF PEN/ METHODS
    public void write(){
        System.out.println("Writing content");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}
class Student{
    String name;
    int age;
    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);

    }
    // Student (String namec,int agec){
    //     System.out.println("Constructor called");
    //     this.name= namec;
    //     this.age = agec;
    // }
    // }
    Student (Student s2){
        System.out.println("Constructor called");
        this.name= s2.name;
        this.age = s2.age;
    }
    Student (){

    }
}

public class oops {
    public static void main(String[] args) {
        // pen1 and pen2 are objects which are being created here


        // Pen pen1= new Pen();
        // pen1.color="blue";
        // pen1.type="gel";
        // pen1.printColor();
        // pen1.write();

        // Pen pen2 = new Pen();
        // pen2.brand = "cello";
        // pen2.color = "black";
        // pen2.printColor();
        // pen2.write();
 
        // Student s1 = new Student("adil",24);
        Student s1 = new Student();
        s1.name= "adil ahmed";
        s1.age = 24;
        Student s2 = new Student(s1);
        s2.printInfo();

        

        s1.printInfo();

    }
}
