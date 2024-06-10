package Polymorphism;
class c1{
    public void display(){
        System.out.println("Parent method.......");
    }
}
class c2 extends c1{

    public void display(){

        System.out.println("Child method.........");
    }
}
public class Upcasting {
    public static void main(String[] args) {
        c1 object=new c2();
        object.display();

    }
}
