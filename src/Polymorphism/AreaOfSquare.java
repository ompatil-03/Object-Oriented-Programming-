package Polymorphism;

import java.util.Scanner;

class square{
    public void area(int a){
        System.out.println("The area of square is "+(a*a));
    }
    public void area(float a){
        System.out.println("The area of square is "+(a*a));
    }

}
public class AreaOfSquare {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of square ");
        int a=s.nextInt();
        square sd=new square();
        sd.area(a);
        System.out.println("Enter the length of square in float :");
        float fl=s.nextFloat();
        sd.area(fl);


    }
}
