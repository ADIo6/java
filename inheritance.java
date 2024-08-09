import java.util.*;
import bank.*;
class Shapes  {
    String color;
    public void area(){
        System.out.println("Display area");
    }
    
}
class Triangle extends Shapes{

    public void printInfo(){
        System.out.println(this.color);
    }
        public void area(int l,int b){

            System.out.println(0.5*l*b);
        }
}
class Circle extends Shapes{
    public void area(int r){
        System.out.println("Area of circle is:"+(3.14)*r*r);
    }
}
public class inheritance {
    public static void main(String[] args) {
    //    Triangle t1 = new Triangle();
    //    t1.color="red"; 
    //    t1.printInfo();
        // bank.Account account1 = new bank.Account();
        // account1.name = "Customer1";
    }
}
