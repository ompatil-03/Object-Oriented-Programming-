package Practice.Abstract;
abstract class Shape3D{
    abstract void calculateVolume();
    abstract void calculateSurfaceArea();
}
class Sphere extends Shape3D{
    int r;
    public Sphere(int r){
        this.r=r;
    }
    @Override
    public void calculateVolume(){
        System.out.println("Volume of sphere is "+(4/3*Math.PI*r*r*r));
    }
    @Override
    public void calculateSurfaceArea(){
        System.out.println("Surface area of sphere is "+(4*Math.PI*r*r));
    }
}
class Cube extends Shape3D{
    int a;
    public Cube(int a){
        this.a=a;
    }
    @Override
    public void calculateVolume(){
        System.out.println("Volume of cube is "+(a*a*a));
    }
    @Override
    public void calculateSurfaceArea(){
        System.out.println("Surface area of cube is "+(6*a*a));
    }
}
public class AbstractVI {
    public static void main(String[] args) {
        Sphere s=new Sphere(5);
        s.calculateVolume();
        s.calculateSurfaceArea();
        System.out.println("--------------------------------");
        Cube c=new Cube(5);
        c.calculateVolume();
        c.calculateSurfaceArea();
    }
}
