package Methods.NOReturn;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int a=s.nextInt();
        int b=s.nextInt();
        Addition ad=new Addition();
        ad.add(a,b);

    }
    public void add(int a,int b){
        int c=a+b;
        System.out.println("The addition of two numbers is :"+c);
    }
}
