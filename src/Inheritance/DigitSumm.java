package Inheritance;

import java.util.Scanner;

public class DigitSumm {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=s.nextInt();
        int sum=digitSum(n);
        while (sum>9){
            sum=digitSum(sum);
        }
        System.out.println("The sum is :"+sum);
    }
    public static int digitSum(int n){
        int sum=0;
        while (n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}
