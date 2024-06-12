package Practice.Abstract;
abstract class Shape2D{
    abstract void draw();
    abstract void resize(int width, int height);
}
class rectangles extends Shape2D{
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
    @Override
    void resize(int width, int height) {
        System.out.println("Resizing a rectangle");
        System.out.println("The new width and height of the rectangle is "+width+" x "+height);
    }
}
class Circles extends Shape2D{
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
    @Override
    void resize(int width, int height) {
        System.out.println("Resizing a circle");
        System.out.println("The new radius of the circle is "+width);
    }
}
public class AbstractX {
    public static void main(String[] args) {
            Shape2D s=new rectangles();
            s.draw();
            s.resize(100,200);
        System.out.println("=======================");
            Shape2D s2=new Circles();
            s2.draw();
            s2.resize(400,200);


    }
}
