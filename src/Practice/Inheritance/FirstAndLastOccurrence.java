package Practice.Inheritance;

import java.util.Arrays;
import java.util.Scanner;
//input : 1 3 5 5 5 5 67 123 125
public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int n=s.nextInt();
        int[]a=new int[n];
        System.out.println("Enter the array Elements :");
        for (int i = 0; i < n; i++) {
            a[i]=s.nextInt();
        }
        System.out.println("Enter the number for checking occurrence :");
        int k=s.nextInt();
        System.out.println("--------------------------");
        System.out.println("The First and last  occurrence of give element is "+ Arrays.toString(occurrence(a,k)));
    }
    public static int[] occurrence(int [] a,int k){
            int []ans ={-1,-1};
            int count=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==k && count==0){
                ans[0]=i;
                count++;
            } else if (a[i]==k && count>0) {
                ans[1]=i;
            }
        }
        return ans;
    }
}
