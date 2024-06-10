package Practice.Inheritance;

import java.util.Scanner;

public class ArmstrongNumber {
    public  static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the range for armstrong number :");
        int n=s.nextInt();
        int m=s.nextInt();
        //armstrong1();
        armstrong2(n,m);

    }

    private static void armstrong2(int n,int m) {
        for (int i = n; i <=m; i++) {
            int j=i,rem=0,sum=0;
            while (j!=0){
                rem=j%10;
                sum+=(rem*rem*rem);
                j/=10;
            }
            if(sum==i){
                System.out.print(i+"  ");
            }
        }
    }

    public  static void  armstrong1(){
        System.out.println("Enter the range for armstrong number :");
        int n=s.nextInt();
        int m=s.nextInt();
        for (int i = n; i <=m; i++) {
                int j=i,rem=0,sum=0;
                while (j!=0){
                    rem=j%10;
                    sum+=(rem*rem*rem);
                    j/=10;
                }
                if(sum==i){
                    System.out.print(i+"  ");
                }
        }
    }
}
