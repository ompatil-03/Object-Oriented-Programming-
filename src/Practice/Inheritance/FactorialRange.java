package Practice.Inheritance;

import java.util.Scanner;

public class FactorialRange {
    public static Scanner s=new Scanner(System.in);

    public static void main(String[] args) {
                fact1();
        System.out.println("Enter the range:");
        int n=s.nextInt();
        int m=s.nextInt();
        fact2(n,m);
    }

    private static void fact2(int n, int m) {
        for (int i = n; i <=m ; i++) {
            int multi=1;
            System.out.print(i+" : " );
            for (int j = 1; j <=i ; j++) {
                multi*=j;
            }
            System.out.println(multi);
        }
    }

    public static void fact1(){
        System.out.println("Enter the Range of Factorial :");
        int n=s.nextInt();
        int m=s.nextInt();
        for (int i = n; i <=m ; i++) {
            int multi=1;
            System.out.print(i+" : " );
            for (int j = 1; j <=i ; j++) {
                    multi*=j;
            }
            System.out.println(multi);
        }
    }
}
