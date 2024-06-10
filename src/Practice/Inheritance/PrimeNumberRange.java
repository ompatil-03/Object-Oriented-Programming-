package Practice.Inheritance;

import java.util.Scanner;

public class PrimeNumberRange {
    public  static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
                PrimeNumberRange pr=new PrimeNumberRange();
               // pr.pRange1();

                System.out.println("Enter range :");
                int n=s.nextInt();
                int m=s.nextInt();
                pr.pRange2(n,m);
    }

    public void pRange2(int a,int b) {
        for (int i = a ; i<=b ; i++) {
            int count=0;
            for (int j = 2; j<=Math.sqrt(i); j++) {
                if(i%j==0){
                    count++;
                }
            }
            if(count==0&& i!=1){
                System.out.print(i+"  ");
            }
        }
    }

    public void pRange1(){

        System.out.println("Enter the range of prime numbers you want :");
        int n=s.nextInt();
        int m=s.nextInt();
        for (int i = n ; i<=m  ; i++) {
            int count=0;
            for (int j = 2; j<=Math.sqrt(i); j++) {
                    if(i%j==0){
                        count++;
                    }
            }
            if(count==0&& i!=1){
                System.out.print(i+"  ");
            }
        }

    }
}
