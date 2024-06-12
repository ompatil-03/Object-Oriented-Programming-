package Practice.Abstract;
abstract class Animal{
    abstract void makeSound();
}
class Lion extends Animal{
    void makeSound(){
        System.out.println("Lion is roaring.....");
    }
}
class Tiger extends Animal{
    void makeSound(){
        System.out.println("Tiger is roaring.....");
    }
}
public class AbstractI
{
    public static void main(String[] args) {
                Animal a1=new Lion();
                a1.makeSound();
                Animal a2=new Tiger();
                a2.makeSound();
    }
}
