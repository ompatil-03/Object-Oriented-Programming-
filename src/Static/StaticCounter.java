package Static;
class D1{
    static int counter=0;
   public D1(){
        counter++;
       System.out.println(counter);
    }
}
public class StaticCounter {
  public  int a=0;
    public static void main(String[] args) {
        D1 d1=new D1();
        D1 d2=new D1();
        D1 d3=new D1();
        D1 d4=new D1();
        D1 d5=new D1();
       // System.out.println(a);
    }
}
