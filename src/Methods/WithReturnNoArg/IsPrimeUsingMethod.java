package Methods.WithReturnNoArg;

import java.util.Scanner;

public class IsPrimeUsingMethod {
    public static void main(String[] args) {
                IsPrimeUsingMethod ip=new IsPrimeUsingMethod();
                boolean p= ip.isPrime();
                if(p){
                    System.out.println("The given number is Prime");
                }else
                    System.out.println("The given number is Not Prime " +
                            "");
    }
    public boolean isPrime(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=s.nextInt();
        for (int i = 2; i <=Math.sqrt(n); i++) {
             if(n%i==0){
                 return false;
             }
        }
     return true;
    }
}
