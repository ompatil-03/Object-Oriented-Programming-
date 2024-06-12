package Practice.Abstract;
abstract class Person{
    abstract void eat();
    abstract void exercise();
}
class LazyPerson extends Person{
    @Override
    void eat() {
        System.out.println("Lazy person is eating junk food.....");
    }
    @Override
    void exercise() {
        System.out.println("Lazy person is Not exercising.....");
    }
}
class Athlete extends Person{
    void eat() {
        System.out.println("Athlete is eating health food.....");
    }
    @Override
    void exercise() {
        System.out.println("Athlete is exercising.....");
    }
}
public class AbstractVIII {
    public static void main(String[] args) {
        Person p=new Athlete();
        p.eat();
        p.exercise();
        System.out.println("====================");
        Person p1=new LazyPerson();
        p1.exercise();
        p1.eat();

    }
}
