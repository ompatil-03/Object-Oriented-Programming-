package Polymorphism;
class method1{
    public void display(){
        System.out.println("No argument method ");
    }
    public void display(int a){
        System.out.println("one int argument method "+a);
    }
    public void display(float a){
        System.out.println("one float argument method "+a);
    }
    public void display(int a,float b){
        System.out.println("First int second float method "+ a+" and "+b);
    }
    public void display(float a,int b){
        System.out.println("First float second int method "+a+" and "+b);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        method1 m=new method1();
        m.display();
        m.display(10);
        m.display(10.3f);
        m.display(55.003f,89);
        m.display(88,112.3f);

    }
}
