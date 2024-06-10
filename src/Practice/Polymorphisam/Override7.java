package Practice.Polymorphisam;
class AnimalX {
    void makeSound(){
        System.out.println("Making sound.......");
    }
    void move(){
        System.out.println("Animal is moving.....");
    }
}
class Bird1 extends AnimalX {
    void makeSound(){
        System.out.println("The Birds are Chirping......");
    }
    void move(){
        System.out.println("Bird is Flying...");
    }
}
class Panther extends AnimalX {
    void makeSound(){
        System.out.println("Panther is Growling........");
    }
    void move(){
        System.out.println("Panther  is walking Silently.....");
    }
}
public class Override7 {
    public static void main(String[] args) {
        AnimalX a=new Bird1();
        a.makeSound();
        a.move();
        AnimalX a2=new Panther();
        a2.makeSound();
        a2.move();
    }
}
