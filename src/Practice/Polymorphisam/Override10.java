package Practice.Polymorphisam;
class AnimalY {
    void makeSound(){
        System.out.println("Making sound.......");
    }
    void eat(){
        System.out.println("Animal is eating.....");
    }
}
class Lion extends AnimalY {
    void makeSound(){
        System.out.println("Lion is roaring.....");
    }
    void eat(){
        System.out.println("Lion is eating");
    }
}
class Panther1 extends AnimalY {
    void makeSound(){
        System.out.println("Panther is Growling........");
    }
    void eat(){
        System.out.println("Panther is eating ");
    }
}
class Tiger extends AnimalY {
    void makeSound(){
        System.out.println("Tiger is Growling........");
    }
    void eat(){
        System.out.println("Tiger is eating");
    }
}
public class Override10 {
    public static void main(String[] args) {
        AnimalY a1=new Lion();
        a1.eat();
        a1.makeSound();
        System.out.println("-----------------------------------------");
        AnimalY a2=new Panther1();
        a2.eat();
        a2.makeSound();
        System.out.println("--------------------------------------------");
        AnimalY a3=new Tiger();
        a3.makeSound();
        a3.eat();
    }
}
