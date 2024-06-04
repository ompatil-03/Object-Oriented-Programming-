package Constroctor;
/*
* There are three rules for constructor overloading
* 1)you have to change the data type to overload a constoructor
* 2)you can change number of arguments
* 3)you can chage the sequence of arguments to overload an constructor
* */
public class ConstructorOverloading {
   public ConstructorOverloading(){
       System.out.println("Default Constructor ");
    }
    public ConstructorOverloading(int i) {
        System.out.println("Constructor with one integer argument of value : "+i);
    }
    public ConstructorOverloading(float i) {
        System.out.println("Constructor with one Float argument of value : "+i);
    }
    public ConstructorOverloading(int i,float j) {
        System.out.println("Constructor with two argument of value : "+i+" and  "+j);
    }
    public ConstructorOverloading( float j,int i) {
        System.out.println("Constructor with two argument of value : "+j+" and  "+i);
    }


    public static void main(String[] args) {
        System.out.println("Main Method Started........");
        System.out.println();
        ConstructorOverloading c1=new ConstructorOverloading();
        ConstructorOverloading c2=new ConstructorOverloading(10);
        ConstructorOverloading c3=new ConstructorOverloading(23.4f);
        ConstructorOverloading c4=new ConstructorOverloading(895,95.4f);
        ConstructorOverloading c5=new ConstructorOverloading(84.9f,75);
        System.out.println();
        System.out.println("Main Method Completed !!!!!");
    }
}
