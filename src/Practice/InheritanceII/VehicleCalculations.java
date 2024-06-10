package Practice.InheritanceII;
class Vehicles{
    int model;
    int year;
    String fuel;
    String make;
   public Vehicles(int model,int year,String fuel,String make){
       this.model=model;
       this.year=year;
       this.fuel=fuel;
       this.make=make;
   }
    public void fuelEfficiency(int a,String s){
        System.out.println("The Fuel efficiency is "+a+"% and the fuel type  is "+s);
    }
    public void distanceTraveled(int a){
        System.out.println("The distance traveled is "+a+" KM");
    }
    public void maxSpeed(int a){
        System.out.println("The max speed is "+a+"KM/Hr");
    }
}
class Truck extends Vehicles{

    public Truck(int model, int year, String fuel,String make) {
        super(model, year, fuel,make);
    }
    public void fuelEfficiency(){
       super.fuelEfficiency(40,this.fuel);
    }
    public void distanceTraveled(){
       super.distanceTraveled(20000);
    }
    public void maxSpeed(){
     super.maxSpeed(150);
    }

}
class Bike  extends Vehicles{
    public Bike(int model, int year, String fuel,String make) {
        super(model, year, fuel, make);
    }
    public void fuelEfficiency(){
        super.fuelEfficiency(70,this.fuel);
    }
    public void distanceTraveled(){
        super.distanceTraveled(2000);
    }
    public void maxSpeed(){
        super.maxSpeed(230);
    }}

class Carr  extends Vehicles{

    public Carr(int model, int year, String fuel ,String make) {
        super(model, year, fuel,make);
    }
    public void fuelEfficiency(){
        super.fuelEfficiency(60,this.fuel);
    }
    public void distanceTraveled(){
        super.distanceTraveled(70000);
    }
    public void maxSpeed(){
        super.maxSpeed(190);
    }
}


public class VehicleCalculations {
    public static void main(String[] args) {
        Carr c=new Carr(11,2018,"Petrol","Honda");
        System.out.println("For Car");
        c.maxSpeed();
        c.distanceTraveled();
        c.fuelEfficiency();
        System.out.println("---------------");
        System.out.println("For Bike");
        Bike b=new Bike(12,2022,"Petrol","BMW");
        b.maxSpeed();
        b.distanceTraveled();
        b.fuelEfficiency();
        System.out.println("-----------------------");
        System.out.println("For Truck");
        Truck t=new Truck(89,2014,"bio-gas","Ford");
        t.fuelEfficiency();
        t.maxSpeed();
        t.distanceTraveled();
    }
}
