package Practice;

import java.util.Arrays;
import java.util.Scanner;
// n=9  input: -12 11 -13 -5 6 -7 5 -3 -6 output:[-12, -13, -5, -7, -3, -6, 11, 6, 5]
public class MoveNegativeII {
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


        int[] b=negativeArray(a);
        int[] c=positiveArray(a);
        int[] d=new int[n];
        int count=0;
        for (int i = 0; i < b.length; i++) {
            if(b[i]!=0)
            d[count++]=b[i];
        }
        for (int i = 0; i < c.length; i++) {
            if(c[i]!=0)
                d[count++]=c[i];
        }
        System.out.println("The modified array is :"+ Arrays.toString(d));
    }

    public static int[] negativeArray(int[] a) {
        int []b =new int[a.length];
        int count=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]<0)
            b[count++]=a[i];
        }
        return b;
    }
    public static int[] positiveArray(int[] a) {
        int []b =new int[a.length];
        int count=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>0)
                b[count++]=a[i];
        }
        return b;
    }
}
