package Methods.WithReturnAndArgs;

import java.util.Scanner;

public class ArrayAddition {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n=s.nextInt();
        int[] a=new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < a.length; i++) {
            a[i]=s.nextInt();
        }
        ArrayAddition ad=new ArrayAddition();
        int ans=ad.addArray(a);
        System.out.println("The array element Addition is :"+ ans );
    }
    public  int addArray(int[] a){
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        return sum;
    }
}
