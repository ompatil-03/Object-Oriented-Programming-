package Practice.Polymorphisam;

import java.util.Scanner;

class Shape{
    public void area(){
        System.out.println("The area of shape is 0");
    }
}
class Circle extends Shape {
    public void area(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the radius of circle :");
        int r=s.nextInt();
        System.out.println("The area of circle is :"+(Math.PI*r*r));
    }
}
class Rectangle extends Shape {
    public void area(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length and breadth  of rectangle  :");
        int l=s.nextInt();
        int b=s.nextInt();
        System.out.println("The area of Rectangle1 is :"+( l * b));
    }
}
class Triangle extends Shape {
    public void area(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the base and height of triangle :");
        int l=s.nextInt();
        int b=s.nextInt();
        System.out.println("The area of Triangle1 is :"+( 0.5*l * b));
    }
}

public class Override3 {
    public static void main(String[] args) {
        Shape s1=new Circle();
        s1.area();
        Shape s2=new Rectangle();
        s2.area();
        Shape s3=new Triangle();
        s3.area();
    }
}
