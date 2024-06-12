package Practice.Abstract;
abstract class Animalia{
    abstract void eat();
    abstract void sleep();
}
class Lions extends Animalia{
    @Override
    void eat() {
        System.out.println("Lion is having a meal...........");
    }
    @Override
    void sleep() {
        System.out.println("Lion is having a nap......");
    }
}
class Tigers extends Animalia{
    @Override
    void eat() {
        System.out.println("Tiger is eating....");
    }
    @Override
    void sleep() {
        System.out.println("Tiger is sleeping...");
    }
}
class Deer extends Animalia{

    @Override
    void eat() {
        System.out.println("Deer is eating grass....");
    }

    @Override
    void sleep() {
        System.out.println("Deer is sleeping.....");
    }
}
public class AbstractIV {
    public static void main(String[] args) {
        Tigers t=new Tigers();
        t.eat();
        t.sleep();
        System.out.println("=============================");
        Lions l=new Lions();
        l.eat();
        l.sleep();
        System.out.println("=============================");
        Deer d=new Deer();
        d.eat();
        d.sleep();
    }
}
