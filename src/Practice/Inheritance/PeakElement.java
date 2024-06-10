package Practice.Inheritance;

import java.util.Scanner;

public class PeakElement {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int n=s.nextInt();
        int[]a=new int[n];
        System.out.println("Enter the array Elements :");
        for (int i = 0; i < n; i++) {
            a[i]=s.nextInt();
        }
        System.out.println("--------------------------");
        System.out.println("The peak element in give array is "+peak(a));
    }
    public static int peak(int[] a){
        int ans=-1;
        for (int i = 1; i < a.length-1; i++) {
                if(a[i]>a[i-1]&& a[i]>a[i+1]){
                    ans=a[i];
                }
        }
        return ans;
    }
}
