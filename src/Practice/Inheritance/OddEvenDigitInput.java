package Practice.Inheritance;

import java.util.Scanner;

public class OddEvenDigitInput {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=s.nextInt();
        System.out.println("Enter the number you want to perform oprations with :");
        int a=s.nextInt();
        System.out.println("\nThe answer is :"+digitOperations(n,a));
    }
    public static boolean isEven(int a){
        return a%2==0;
    }
    public static int digitOperations(int n,int i){
        int ans=0;
        int a=n,sum=0,rem=0;
        while (a!=0){
            rem=a%10;
            if(isEven(rem)&& rem!=0){
                System.out.print(rem+"/"+i+" + ");
                ans+=rem/i;
            }else{
                System.out.print(rem+"*"+i+" + ");
                ans+=rem*i;
            }
            a/=10;
        }
        return ans;
    }
}
