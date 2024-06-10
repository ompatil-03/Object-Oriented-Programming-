package Practice.Polymorphisam;
class Vehicle {
    public void speedUp(){
        System.out.println("Vehicle speed is fast");
    }
}
class Bicycle extends Vehicle{
    public void speedUp(){
        System.out.println("Bicycle speed is 20Km/hr");
    }
}
class Car extends Vehicle{
    public void speedUp(){
        System.out.println("Car speed is 180km/hr");
    }
}
public class Override2 {
    public static void main(String[] args) {
        Vehicle v1=new Bicycle();
        v1.speedUp();
        Vehicle v2=new Car();
        v2.speedUp();
    }
}
