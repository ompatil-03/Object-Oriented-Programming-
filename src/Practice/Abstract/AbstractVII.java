package Practice.Abstract;
abstract class Vehicle{
    abstract void start();
    abstract void stop();
}
class Car extends Vehicle{
    @Override
    void start() {
        System.out.println("Car is starting......");
    }
    @Override
    void stop() {
        System.out.println("Car is stopping......");
    }
}
class Bike extends Vehicle{
    @Override
    void start() {
        System.out.println("Bike is starting......");
    }
    @Override
    void stop() {
        System.out.println("Bike is stopping......");
    }
}
public class AbstractVII {
    public static void main(String[] args) {
            Vehicle v=new Car();
            v.start();
            v.stop();
        System.out.println("==================================");
            Vehicle v2=new Bike();
            v2.start();
            v2.stop();
    }
}
