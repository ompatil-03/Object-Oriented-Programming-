package Methods.NOReturn;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the range of Fibonacci Series :");
        int n=s.nextInt();
        Fibonacci f=new Fibonacci();
        f.series(n);
    }
    public void series(int n){
        System.out.println("The Fibonacci Series up to given range is ");
        int a=0;
        int b=1;
        for (int i = 0; i < n; i++) {
             int c=a+b;
            System.out.print(a+" ");
             a=b;
             b=c;
        }
    }
}
