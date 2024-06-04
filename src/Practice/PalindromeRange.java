package Practice;

import java.util.Scanner;

public class PalindromeRange {
    static Scanner s=new Scanner(System.in);

    public static void main(String[] args) {
        palindrome1();
        System.out.println("\nEnter Range: ");
        int n=s.nextInt();
        int m=s.nextInt();
        palindrome2(n,m);

    }

    private static void palindrome2(int n,int m) {

        for (int i = n; i <=m; i++){
            int j=i;
            int rem=0,sum=0;
            while (j!=0){
                rem=j%10;
                sum=sum*10+rem;
                j/=10;
            }
            if(sum==i){
                System.out.print(i+" ");
            }
        }
    }

    public static void palindrome1(){
        System.out.println("Enter the range for palindrome:");
        int n=s.nextInt();
        int m=s.nextInt();
        for (int i = n; i <=m; i++){
                int j=i;
                int rem=0,sum=0;
                while (j!=0){
                    rem=j%10;
                    sum=sum*10+rem;
                    j/=10;
                }
                if(sum==i){
                    System.out.print(i+" ");
                }
        }
    }

}
