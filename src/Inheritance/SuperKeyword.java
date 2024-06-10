package Inheritance;
class P1{
  int a=1000;
  public void display(){
      System.out.println("----------------------------------");
      System.out.println("The method from grand parent class ");
  }

}
class C1 extends P1{
    int a=100;
    public  void display(){
        System.out.println("----------------------------------");
        System.out.println("Method of parent class ");
        System.out.println("The value of parent class "+a);
        System.out.println("The value from grand parent class "+super.a);
        super.display();
    }
}
class C2 extends C1{
   int a=10;
   public void display(){
       System.out.println("method of current class ");
       System.out.println("The value of current  child class :"+a);
       System.out.println("The value form parent class "+super.a);
       super.display();
   }
}
public class SuperKeyword {
    public static void main(String[] args) {
        C2 c=new C2();
        c.display();
    }
}
