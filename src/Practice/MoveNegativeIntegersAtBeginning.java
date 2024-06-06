package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class MoveNegativeIntegersAtBeginning {
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
        System.out.println("The Final array is : "+ Arrays.toString(moveNeg(a)));
    }
    public static int[] moveNeg(int[] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]>0 && a[j]<0){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }
}
