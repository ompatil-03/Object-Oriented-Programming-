package Practice.Polymorphisam;


class Shape2{
    public void area(){
        System.out.println("The area of shape is 0");
    }
    public void drawing(){
        System.out.println("Drawing shape...");
    }
}
class Circle2 extends Shape2 {
    public void area(){
        System.out.println("Radius: 15");
        System.out.println("The area of circle is :"+(Math.PI*15*15));
    }
    public void drawing(){
        System.out.println("Drawing circle...");
    }
}
class Rectangle2 extends Shape2 {
    public void area(){
        System.out.println("Length: 15 breadth: 39");
        System.out.println("The area of Rectangle1 is :"+(15*39));
    }
    public void drawing(){
        System.out.println("Drawing rectangle...");
    }
}
class Triangle2 extends Shape2{
    public void area(){
        System.out.println("base :20  height:56");
        System.out.println("The area of Triangle1 is :"+( 0.5*20*56));
    }
    public void drawing(){
        System.out.println("Drawing triangle...");
    }
}
public class Override8 {
    public static void main(String[] args) {
        Shape2 s1=new Circle2();
        s1.area();
        s1.drawing();
        System.out.println("-------------------------------");
        Shape2 s2=new Rectangle2();
        s2.drawing();
        s2.area();
        System.out.println("-------------------------------");
        Shape2 s3=new Triangle2();
        s3.area();
        s3.drawing();
    }
}
