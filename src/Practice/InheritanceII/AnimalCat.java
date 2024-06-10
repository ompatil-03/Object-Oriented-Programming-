package Practice.InheritanceII;
class Animmals{
    public void makeSound(){
        System.out.println("Animal Making Sound.....");
    }
}
class cat extends Animmals{
    public void makeSound(){
        System.out.println("Meow.....");
    }
}
public class AnimalCat
{
    public static void main(String[] args) {
        cat cod=new cat();
        cod.makeSound();
    }

}
