package Practice.Polymorphisam;
class Vehicle1 {
    public void startUp(){
        System.out.println("Vehicle engine starts....");
    }
    public void stopEngine(){
        System.out.println("Vehicle engine stops");
    }
}
class MotorCycle extends Vehicle1{
    public void startUp(){
        System.out.println("MotorCycle engine starts....");
    }
    public void stopEngine(){
        System.out.println("MotorCycle engine stops");
    }
}
class Car1 extends Vehicle1{
    public void startUp(){
        System.out.println("Car engine starts....");
    }
    public void stopEngine(){
        System.out.println("Car engine stops");
    }
}
public class Override11 {
    public static void main(String[] args) {
        Vehicle1 v1=new Car1();
        v1.startUp();
        v1.stopEngine();
        System.out.println("----------------------------------");
        Vehicle1 v2=new MotorCycle();
        v2.stopEngine();
        v2.startUp();
    }
}
