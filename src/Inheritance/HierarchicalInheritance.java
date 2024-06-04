package Inheritance;
class Animals{
    void  eat(){
        System.out.println("Eating Something...........");
    }
}
class Monkey extends Animals{
    void jump(){
        System.out.println("Jumping......");
    }
}
class Human extends Animals{
    void running(){
        System.out.println("Running......");
    }
}
public class HierarchicalInheritance {

    public static void main(String[] args) {
        System.out.println("Methods accessible by first child :");
        Monkey m=new Monkey();
        m.eat();
        m.jump();
        System.out.println("Methods accessible by second child :");
        Human h=new Human();
        h.running();
        h.eat();
    }
}
