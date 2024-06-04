package Methods.NOReturn;

import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int a[]={1 , 52 ,63,89,96,12,45,999};
        System.out.println("Orignle Array :");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        ArrayInput ar=new ArrayInput();
        ar.max(a);
    }
    public void max(int[] a){
        int maxNum=0;
        System.out.println("\n------------------------------------------------");
        for (int i = 0; i < a.length; i++) {
            if(a[i]>maxNum){
                maxNum=a[i];
            }
        }
        System.out.println("The maximum number form given numbers is :"+maxNum);
    }
}
