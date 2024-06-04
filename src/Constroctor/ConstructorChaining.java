package Constroctor;

public class ConstructorChaining {
    public ConstructorChaining(){
        this(12);
        System.out.println("Default Constructor");
    }
    public ConstructorChaining(int a){
        this(45.7f);
        System.out.println("Constructor with one integer Parameter: "+a);
    }
    public ConstructorChaining(float f){
        this(45,96.6f);
        System.out.println("Constructor with one float Parameter: "+f);
    }
    public ConstructorChaining(int a,float b){
        this(85.9f,99);
        System.out.println("Constructor with two parameters :"+a+" and "+b);
    }
    public  ConstructorChaining(float a,int b){
        System.out.println("Constructor with two parameters: "+a+" and "+b);
    }

    public static void main(String[] args) {
        System.out.println("Main method Started.......");
        System.out.println();
        ConstructorChaining cc=new ConstructorChaining();
        System.out.println();
        System.out.println("Main method Completed!!!!!!!!!");
    }
}
