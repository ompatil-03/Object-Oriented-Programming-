package Practice.Inheritance;

import java.util.Scanner;

public class EquilibriumPoint {
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
        int currSum=0,maxSum=0,temp=0;
        boolean b=false;
        for (int i = 0; i < n; i++) {
            maxSum+=a[i];
        }
        for (int i = 0; i < n; i++) {
            currSum+=a[i];
            if(maxSum-currSum==currSum-a[i]){
               b=true;
               temp=i+1;
               break;
            }
        }
        if (b){
            System.out.println("The equilibrium point is :"+temp);
        }else {
            System.out.println("No equilibrium point found");
        }
    }
}
