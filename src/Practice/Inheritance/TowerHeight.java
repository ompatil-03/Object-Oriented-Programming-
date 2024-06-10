package Practice.Inheritance;

import java.util.Arrays;
import java.util.Scanner;

public class TowerHeight {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int n=s.nextInt();
        int[]a=new int[n];
        System.out.println("Enter the array Elements :");
        for (int i = 0; i < n; i++) {
            a[i]=s.nextInt();
        }
        System.out.println("Enter the modification height: ");
        int k=s.nextInt();
        System.out.println("--------------------------");
        System.out.println("The Maximum difference after modification is "+height(a,k));
    }
    public static int height(int[] a,int k){
        for (int i = 0; i < a.length; i++) {
            if(a[i]-k<0){
                a[i]+=k;
            }
            else {
                a[i]-=k;
            }
        }
        System.out.println("The new modified array is "+Arrays.toString(a));
        return minDifferance(a);
    }
    public static int minDifferance(int []a ){
        int max=0,min=Integer.MAX_VALUE;
        for (int i = 0; i <a.length; i++) {
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
        }
        return max-min;
    }
}
