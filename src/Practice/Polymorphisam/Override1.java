package Practice.Polymorphisam;

class Animal{
    void makeSound(){
        System.out.println("Making sound.......");
    }
}
class Bird extends Animal {
    void makeSound(){
        System.out.println("The Birds are Chirping......");
    }
}
class Cat extends Animal {
        void makeSound(){
            System.out.println("Cat1 is meowing.......");
        }
}
public class Override1 {
    public static void main(String[] args) {
        Animal a=new Bird();
        a.makeSound();
        Animal a2=new Cat();
        a2.makeSound();
    }
}
