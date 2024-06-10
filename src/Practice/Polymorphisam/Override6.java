package Practice.Polymorphisam;

import java.util.Scanner;

class Shape1 {
    public void area(){
        System.out.println("The area of shape is 0");
    }
    public void parameter(){
        System.out.println("The parameter of shape is 0");
    }
}
class Circle1 extends Shape1 {
    public void area(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the radius of circle :");
        int r=s.nextInt();
        System.out.println("The area of circle is :"+(Math.PI*r*r));

    }
    public void parameter(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the radius of circle :");
        int r=s.nextInt();
        System.out.println("The parameter of square is "+(2*Math.PI*r));
    }
}
class Rectangle1 extends Shape1 {
    public void area(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length and breadth  of rectangle  :");
        int l=s.nextInt();
        int b=s.nextInt();
        System.out.println("The area of Rectangle1 is :"+( l * b));
    }
    public void parameter(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length and breadth  of rectangle  :");
        int l=s.nextInt();
        int b=s.nextInt();
        System.out.println("The parameter of square is "+(l+b)*2);
    }
}
class Triangle1 extends Shape1 {
    public void area(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the base and height of triangle :");
        int l=s.nextInt();
        int b=s.nextInt();
        System.out.println("The area of Triangle is :"+( 0.5*l * b));
    }
    public void parameter(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the three sides of triangle :");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        System.out.println("The parameter of triangle is :"+(a+b+c));
    }
}

public class Override6 {
    public static void main(String[] args) {
        Shape1 s1=new Circle1();
        s1.area();
        s1.parameter();
        System.out.println("-------------------------------------------");
        Shape1 s2=new Rectangle1();
        s2.area();
        s2.parameter();
        System.out.println("-------------------------------------------");
        Shape1 s3=new Triangle1();
        s3.area();
        s3.parameter();
    }
}
