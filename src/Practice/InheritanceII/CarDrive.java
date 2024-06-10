package Practice.InheritanceII;
class Vehicle {
    public void drive(){
        System.out.println("Driving a Vehicle ");
    }
}
class Car extends Vehicle{
    public void drive(){
        System.out.println("Driving a Car..... ");
    }
}
public class CarDrive {
    public static void main(String[] args) {
        Car c=new Car();
        c.drive();
    }
}
