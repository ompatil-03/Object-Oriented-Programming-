package Static;
class base{
    public static void show(){
        System.out.println("base class static method");
    }
    public void show2(){
        System.out.println("base class non static method");
    }
}
class child extends base{
    public static void show(){
        System.out.println("child class static method");
    }
    public void show2(){
        System.out.println("child class non static method");
    }
}
public class MethodHiding {
    public static void main(String[] args) {
        System.out.println("Upcasting:");
        base b=new child();
        b.show();
        b.show2();
        System.out.println("----------------------------------------------------------------");
        System.out.println("Child class object:");
        child c=new child();
        c.show();
        c.show2();
    }
}
