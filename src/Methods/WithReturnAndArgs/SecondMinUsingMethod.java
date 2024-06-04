package Methods.WithReturnAndArgs;

import java.util.Scanner;

public class SecondMinUsingMethod {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Array Size:");
        int n=s.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the Elements of given Array :");
        for (int i = 0; i < n; i++) {
            a[i]=s.nextInt();
        }
        SecondMinUsingMethod sm=new SecondMinUsingMethod();
        int smin=sm.secMinimum(a);
        System.out.println("The Second minimum number is :"+smin);
    }
    public int secMinimum(int[] a){
        int secMin=Integer.MAX_VALUE,min=Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if(a[i]<min){
                secMin=min;
                min=a[i];
            }
            else if (a[i]<secMin && a[i]!=min){
                secMin=a[i];
            }

        }
        return secMin;

    }
}
