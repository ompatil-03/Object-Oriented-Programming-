package Constroctor;

import java.util.Scanner;

public class PrimeArrayUsingContractor {
    Scanner s=new Scanner(System.in);
    int[] a;
    public PrimeArrayUsingContractor(){
        this.input();
    }
    public void input(){
        System.out.println("Enter the size of array");
        int n=s.nextInt();
        this.a=new int[n];
        System.out.println("Enter the array Elements :");
        for (int i = 0; i < n; i++) {
            a[i]=s.nextInt();
        }
        this.primeArray(a);
    }
    public void primeArray(int []a){
        System.out.println("The prime elements are :");
        for (int i = 0; i < a.length; i++) {
            int j=a[i],count=0;
            for (int k =2; k <=Math.sqrt(a[i]) ; k++) {
                 if(j%k==0){
                     count++;
                 }
            }
            if (count==0 && a[i]!=1){
                System.out.print(a[i]+"  ");
            }
        }
    }
    public static void main(String[] args) {
        PrimeArrayUsingContractor pc=new PrimeArrayUsingContractor();
    }
}
