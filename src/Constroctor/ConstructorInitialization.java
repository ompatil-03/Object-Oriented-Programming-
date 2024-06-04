package Constroctor;

public class ConstructorInitialization {
    public ConstructorInitialization(){
        System.out.println("The constorcort is called !!!!");
    }
    public static void main(String[] args) {
        System.out.println("Main Starts ");
        ConstructorInitialization cs=new ConstructorInitialization();
        System.out.println("Main End !!!!!!");

    }
    public void ConstructorInitialization(){
        System.out.println("This is Method");
    }
}
