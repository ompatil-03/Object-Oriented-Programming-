package Inheritance;

class AinmalX{
    public void makeSound(){
        System.out.println("Making sound...........");
    }
}
class child extends AinmalX{

}
public class MethodOverriding {
    public static void main(String[] args) {
        child c=new child();
        c.makeSound();
    }
}
