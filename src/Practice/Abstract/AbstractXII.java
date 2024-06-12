package Practice.Abstract;
abstract class GeometricShapes{
    abstract void calculateArea();
    abstract void calculatePerimeter();
}
class Triangles extends GeometricShapes{
    int a,b,c;
    public Triangles(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    @Override
    public void calculateArea(){
        System.out.println("Area of triangle is :"+(a*b*c)/2);
    }
    @Override
    public void calculatePerimeter(){
        System.out.println("Perimeter of triangle is :"+(a+b+c));
    }
}
class Square extends GeometricShapes{
    int a;
    public Square(int a){
        this.a=a;
    }
    @Override
    void calculateArea() {
        System.out.println("The area of square is "+(a*a));
    }

    @Override
    void calculatePerimeter() {
        System.out.println("The perimeter of square is "+(4*a));
    }
}
public class AbstractXII {
    public static void main(String[] args) {
           GeometricShapes g1=new Triangles(12,23,44);
           g1.calculateArea();
           g1.calculatePerimeter();
        System.out.println("==========================");
        GeometricShapes g2=new Square(23);
        g2.calculatePerimeter();
        g2.calculateArea();
    }
}
