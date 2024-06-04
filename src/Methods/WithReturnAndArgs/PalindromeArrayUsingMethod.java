package Methods.WithReturnAndArgs;

import java.util.Scanner;

public class PalindromeArrayUsingMethod {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n=s.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            a[i]=s.nextInt();
        }
        PalindromeArrayUsingMethod pa=new PalindromeArrayUsingMethod();
        int[] b=pa.palindromeArray(a);
        System.out.println("The palindrome Array is ");
        for (int i = 0; i < b.length; i++) {
            if (b[i]!=0)
            System.out.print(b[i]+"  ");
        }

    }
    public  int[] palindromeArray(int[] a){
        int[] ans=new int[a.length];
        int c=0;
        for (int i = 0; i < a.length; i++) {
            int j=a[i],sum=0,rem=0;
            while(j!=0){
                rem=j%10;
                sum=sum*10+rem;
                j/=10;
            }
            if(a[i]==sum){
                ans[c++]=a[i];
            }
        }
        return ans;
    }
}
