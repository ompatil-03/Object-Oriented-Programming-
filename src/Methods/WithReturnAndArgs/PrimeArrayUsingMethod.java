package Methods.WithReturnAndArgs;

import java.util.Scanner;

public class PrimeArrayUsingMethod {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n=s.nextInt();
        int[] a=new int[n];
        System.out.println("Enter Array Elements :");
        for (int i = 0; i < n; i++) {
            a[i]=s.nextInt();
        }
        System.out.println("The prime Array is :");
        int[] b=primeArray(a);
        for (int i = 0; i < b.length; i++) {
            if (b[i]!=0)
                System.out.println(b[i]);
        }
    }

    public static int[] primeArray(int[] a) {
        int[] ans=new int[a.length];
        int c=0;
        for (int i = 0; i < a.length; i++) {
            int j=a[i],count=0;
            for (int k = 2; k <=Math.sqrt(j); k++) {
                if(j%k==0){
                    count++;
                }
            }
            if(count==0 && a[i]!=1){
                ans[c++]=a[i];
            }
        }
        return ans;
    }
}
