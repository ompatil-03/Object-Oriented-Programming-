package Methods.WithReturnAndArgs;

import java.util.Arrays;
import java.util.Scanner;

public class RangePrimeMethod {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the range of Prime numbers you want: ");
        int a=s.nextInt();
        int b=s.nextInt();
        //primeRangeI(a,b);
        System.out.println("The array of prime number in given range is :");
        int[] ans=primeRangeII(a,b);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] primeRangeII(int a, int b) {
        int count=0;
        for (int i = a; i <= b; i++) {
            int cnt=0;
            for (int j = 2; j <=Math.sqrt(i); j++) {
                if (i%j==0){
                    cnt++;
                }
            }
            if (cnt==0 && i!=1){
                count++;
            }
        }
        int[] ans=new int[count];
        count=0;
        for (int i = a; i <= b; i++) {
            int cnt=0;
            for (int j = 2; j <=Math.sqrt(i); j++) {
                if (i%j==0){
                    cnt++;
                }
            }
            if (cnt==0 && i!=1){
               ans[count++]=i;
            }
        }
        return ans;
    }

    private static void primeRangeI(int a, int b) {
        for (int i = a; i <= b; i++) {
            int cnt=0;
            for (int j = 2; j <=Math.sqrt(i); j++) {
                if (i%j==0){
                    cnt++;
                }
            }
            if (cnt==0 && i!=1){
                System.out.print(i+"  ");
            }
        }
    }

}
