package InterfacesInJava;

interface  I1{
    void display();
    default  void display1(){
        System.out.println("First interface Default...");
    }
    static void display2(){
        System.out.println("Static of first interface.....");
    }
}
interface I2{
    void display();
    default void display1(){
        System.out.println("Second interface...");
    }
    static void display2(){
        System.out.println("Static of second interface .....");
    }
}
public class InterI implements  I1,I2{
    public static void main(String[] args) {
        InterI i=new InterI();
        i.display();
        i.display1();
        I1.display2();
        I2.display2();
    }


    @Override
    public  void display() {
        System.out.println("Hello world....");
    }

    @Override
    public void display1() {
        I1.super.display1();
    }

}
