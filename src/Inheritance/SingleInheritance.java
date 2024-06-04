package Inheritance;

public class SingleInheritance {
    public static void main(String[] args) {
        cat c=new cat();
        c.meow();
        c.eat();

    }
}
class Animal{
    int population =10000;
    public void eat(){
        System.out.println("Currently eating something........");
    }
}
class cat extends Animal{
    public void meow(){
        System.out.println("Meow.............");
    }
}
