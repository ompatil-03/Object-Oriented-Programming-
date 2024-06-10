package Practice.Inheritance;

import java.util.Scanner;

public class KthLargestElement
{
        public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int n=s.nextInt();
        int[]a=new int[n];
        System.out.println("Enter the array Elements :");
        for (int i = 0; i < n; i++) {
            a[i]=s.nextInt();
        }
        System.out.println("Enter the kth largest element you want: ");
        int k=s.nextInt();
        System.out.println("--------------------------");
        System.out.println("The kth largest element is :"+largest(a,k));

    }
    public static int largest(int [] a,int k){
            for (int i = 0; i < a.length; i++) {
                    for (int j = i+1; j < a.length; j++) {
                            if(a[i]>a[j]){
                                    int temp=a[i];
                                    a[i]=a[j];
                                    a[j]=temp;
                            }
                    }
            }
              //Arrays.sort(a);
               return a[k-1];
    }
}
