package Practice.InheritanceII;
class Shapes {
  public  void getPerimeter(){

  }
  public void getArea(){

  }
}
class Circle extends Shapes{
    public  void getPerimeter(int r){
        System.out.println("The Perimeter of circle is "+(2*Math.PI*r));
    }
    public void getArea(int r){
        System.out.println("The Area of circle is "+(Math.PI*r*r));
    }
}
public class AreaPerimeter {
    public static void main(String[] args) {
         Circle c=new Circle();
        System.out.println("For radius equals to 45 ");
         c.getArea(45);
         c.getPerimeter(45);
    }
}
