package Practice.Abstract;
abstract class Bird{
    abstract void fly();
    abstract void makeSound();
}
class Eagle extends Bird{
    @Override
    void fly(){
        System.out.println("Eagle is flying........");
    }
    @Override
    void makeSound(){
        System.out.println("Eagle is making sound ......");
    }
}
class Hawk extends Bird{
    @Override
    void fly(){
        System.out.println("Hawk is flying........");
    }
    @Override
    void makeSound(){
        System.out.println("Hawk is making sound ......");
    }
}
public class AbstractXI {
    public static void main(String[] args) {
            Bird b=new Eagle();
            b.fly();
            b.makeSound();
            System.out.println("--------------------------------");
            Bird b2=new Hawk();
            b2.fly();
            b2.makeSound();
    }
}
