package Practice.Interface;
interface Shape{
    void getArea();
}
class Triangle implements Shape{
    public void getArea(){
        System.out.println("The area of triangle is 100");
    }
}
class Circle implements Shape{
    public void getArea(){
        System.out.println("The area of circle is 200");
    }
}
public class InterfaceI {
    public static void main(String[] args) {
        Triangle t=new Triangle();
        t.getArea();
        Circle c=new Circle();
        c.getArea();
    }
}
