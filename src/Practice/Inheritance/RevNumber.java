package Practice.Inheritance;

import java.util.Scanner;

public class RevNumber {
    static Scanner s=new Scanner(System.in);

    public static void main(String[] args) {
        revNum1();
        System.out.println();
        System.out.println("Enter the range to revers : ");
        int n=s.nextInt();
        int m=s.nextInt();
        revNum2(n,m);
    }

    private static void revNum2(int n,int m) {
        for (int i = n; i <=m; i++){
            int j=i;
            int rem=0,sum=0;
            while (j!=0){
                rem=j%10;
                sum=sum*10+rem;
                j/=10;
            }

                System.out.print(sum+" ");

        }
    }

    private static void revNum1() {
        int n=101,m=200;
        for (int i = n; i <=m; i++){
            int j=i;
            int rem=0,sum=0;
            while (j!=0){
                rem=j%10;
                sum=sum*10+rem;
                j/=10;
            }

                System.out.print(sum+" ");

        }
    }
}
