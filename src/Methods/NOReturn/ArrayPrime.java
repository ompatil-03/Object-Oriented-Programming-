package Methods.NOReturn;

import java.util.Scanner;

public class ArrayPrime {
    public static void main(String[] args) {
        ArrayPrime ap=new ArrayPrime();
        ap.APrime();
    }

    public void APrime() {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int n=s.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the array elements :");
        for (int i = 0; i < a.length; i++) {
            a[i]=s.nextInt();
        }
        System.out.println("Prime numbers are :");
        for (int i = 0; i < n; i++) {
            int count=0;
            for (int j = 2; j <= Math.sqrt(a[i]); j++) {
                if(a[i]%j==0){
                    count++;
                }
            }
            if (count==0 && a[i]!=1){
                System.out.println(a[i]+"  ");
            }
        }
    }


}
