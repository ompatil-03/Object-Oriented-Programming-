package Polymorphism;
class  D1{
    public D1(){
        System.out.println("99999999999999");
    }
    String name;
    public void display(){
        System.out.println("Parent class Method........");
    }
}
class D2 extends D1{
    public  D2(){
        System.out.println("88888888888888888");
    }
    int age;
    public void display(){
        System.out.println("Child class Method.........");
    }
}
public class DownCasting {
    public static void main(String[] args) {
        D1 object1=new D2();
        D2 object2=(D2) object1;
        object2.name="John";
        object2.age=23;
        System.out.println(object2.age);
        System.out.println(object1.name);
        object2.display();
//        D1 mf=new D1();
//        System.out.println(object1.name);

    }
}
