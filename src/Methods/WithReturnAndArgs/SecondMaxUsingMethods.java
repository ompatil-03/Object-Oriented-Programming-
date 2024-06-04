package Methods.WithReturnAndArgs;

import java.util.Scanner;

public class SecondMaxUsingMethods {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int n=s.nextInt();
        System.out.println("Enter the Array Elements :");
        int[] a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=s.nextInt();
        }
        SecondMaxUsingMethods sm=new SecondMaxUsingMethods();
        int sec=sm.secMax(a);
        System.out.println("The second max Element in given array is :"+sec);
    }
    public int secMax(int[] a){
        int max=0,secMax=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max){
                secMax=max;
                max=a[i];
            } else if (a[i]>secMax && a[i]!=max) {
                secMax=a[i];
            }
        }
        return secMax;
    }
}
