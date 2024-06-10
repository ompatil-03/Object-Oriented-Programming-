package Practice.Polymorphisam;

import java.util.Scanner;

class Shape3{
    public void area(){
        System.out.println("The area of shape is 0");
    }
    public void drawing(){
        System.out.println("Drawing Shape......");
    }
}
class Circle3 extends Shape3 {
    public void area(){
        System.out.println("For radius:36");
        System.out.println("The area of circle is :"+(Math.PI*36*36));
    }
    public void drawing(){
        System.out.println("Drawing Circle......");
    }
}
class Cylinder extends Shape3 {
    public void area(){
        System.out.println("For radius: 12 and height: 29");
        System.out.println("The Surface area of Cylinder is :"+((2*Math.PI*12*29)+(2*Math.PI*12*12)));
    }
    public void drawing(){
        System.out.println("Drawing Cylinder......");
    }
}
public class Override12 {
    public static void main(String[] args) {
        Shape3 s1=new Circle3();
        s1.area();
        s1.drawing();
        System.out.println("------------------------------");
        Shape3 s2=new Cylinder();
        s2.drawing();
        s2.area();
    }
}
