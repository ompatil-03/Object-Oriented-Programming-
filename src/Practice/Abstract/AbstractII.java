package Practice.Abstract;

import java.util.Scanner;

abstract class Shape{
    abstract void calculateArea();
    abstract void calculatePerimeter();
}
class Circle extends Shape{
    int a;
    public Circle(int a){
        this.a=a;
    }
    @Override
    void calculateArea() {
        System.out.println("The area of circle with radius "+this.a+" is "+(Math.PI*a*a));
    }
    @Override
    void calculatePerimeter() {
        System.out.println("The perimeter of circle with radius "+this.a+" is "+(Math.PI*a*2));
    }
}
class Triangle extends Shape{

    @Override
    void calculateArea() {
        System.out.println("For height :20 and base: 25 the area of triangle is "+(0.5*20*25));
    }

    @Override
    void calculatePerimeter() {
        System.out.println("For all side : 10 20 30 the perimeter of triangle is "+60);
    }
}
public class AbstractII {
    public static void main(String[] args) {
        Circle c=new Circle(42);
        c.calculateArea();
        c.calculatePerimeter();
        System.out.println("--------------------------------");
        Triangle t=new Triangle();
        t.calculateArea();
        t.calculatePerimeter();
    }
}
