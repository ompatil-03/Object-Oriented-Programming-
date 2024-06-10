package Practice.InheritanceII;
class Shape{
    public void area(int a,int b){
        System.out.println("Area of shape is :"+(a*b));
    }
}
class Rectangle extends Shape{
    int a;
    int b;
    public Rectangle(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void area(){
        System.out.println("Area of rectangle is "+(this.a*this.b));
    }
}

public class ShapeCalculations {
    public static void main(String[] args) {
        Rectangle r=new Rectangle(45,35);
        r.area();

    }
}
