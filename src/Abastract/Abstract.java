package Abastract;
abstract class  Timestamp{
    public Timestamp() {
        System.out.println("Base class constructor");
    }
    abstract void display();
    public void print(){
        System.out.println("Non abstract method form base class");
    }
}
public class Abstract extends Timestamp {
    public Abstract() {
        super();
        System.out.println("Child class constructor");
    }
    public static void main(String[] args) {
        Abstract a=new Abstract();
        System.out.println("-----------------------------");
        a.display();
        a.print();
    }
    @Override
    void display() {
        System.out.println("Abstract method method implemented in child class");
    }
}
