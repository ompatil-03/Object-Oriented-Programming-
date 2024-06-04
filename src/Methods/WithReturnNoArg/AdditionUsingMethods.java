package Methods.WithReturnNoArg;

import java.util.Scanner;

public class AdditionUsingMethods {
    public static void main(String[] args) {
        AdditionUsingMethods ad=new AdditionUsingMethods();
       int a= ad.addition();
        System.out.println("The addition is :"+a);
    }
    public static int addition(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int a=s.nextInt();
        int b=s.nextInt();

        return a+b;
    }
}
