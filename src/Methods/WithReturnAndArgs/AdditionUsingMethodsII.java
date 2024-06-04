package Methods.WithReturnAndArgs;

import java.util.Scanner;

public class AdditionUsingMethodsII {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        AdditionUsingMethodsII au=new AdditionUsingMethodsII();
        System.out.println("Enter two numbers :");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=au.add2(a,b);
        System.out.println("The addition is : "+c);
    }
    public  int add2(int a,int b){
        return a+b;
    }
}
