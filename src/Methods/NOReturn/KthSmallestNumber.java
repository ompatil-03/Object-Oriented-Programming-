package Methods.NOReturn;

import java.util.Scanner;

public class KthSmallestNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=s.nextInt();
        KthSmallestNumber kt=new KthSmallestNumber();
        kt.calculation(n);
    }
    public void calculation(int n){
        int i=n;
        int sum=0,rem=0;
        while (i!=0){
            rem=i%10;
            if(rem%2==0 && rem!=0){
                sum+=rem/2;
                System.out.print(rem+"/2 +");
            }else {
                sum+=rem*2;
                System.out.print(rem+"*2 +");
            }
            i/=10;
        }
        System.out.println("----->\nThe final value after performing action is:"+sum);
    }
}
