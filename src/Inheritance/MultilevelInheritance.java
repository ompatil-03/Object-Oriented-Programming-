package Inheritance;
class instrument{
    public  void display(){
        System.out.println("This is an instrument........");
    }
}
class car extends instrument{
    public void carr(){
        System.out.println("This is car.........");
    }
}
class bmw extends car{
    public void type(){
        System.out.println("This is BMW..........");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        bmw b=new bmw();
        b.type();
        b.carr();
        b.display();
    }
}
