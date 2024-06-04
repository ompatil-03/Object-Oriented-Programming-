package AccessModifiers;

import Constroctor.ThisKeyword;

class TemporaryClass{
    public int a=10;
    private int b=20;
    public TemporaryClass(){
        System.out.println("Inside the class ");
        System.out.println("The value of a is "+a);
        System.out.println("The value of b is "+b);
    }
}
public class PublicAndPrivate  {
    public static void main(String[] args) {
            TemporaryClass tc=new TemporaryClass();
        System.out.println("Outside the class:");
        System.out.println("The value of a outside the class is :"+tc.a);
      //  System.out.println("The value of b outside the class is  :"+tc.b);

    }
}
