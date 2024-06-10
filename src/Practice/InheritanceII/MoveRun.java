package Practice.InheritanceII;
class Animalia{
    public void move(){
        System.out.println("Animal moves.....");
    }
}
class Cheetah extends Animalia{
    public void move(){
        System.out.println("Cheetah runs Fast...");
    }
}
public class MoveRun {
    public static void main(String[] args) {
        Cheetah ch=new Cheetah();
        ch.move();

        Animalia am=new Animalia();
        am.move();
    }
}
