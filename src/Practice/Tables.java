package Practice;

import java.util.Scanner;

public class Tables {
    static Scanner s=new Scanner(System.in);

    public static void main(String[] args) {
        table();
        System.out.println("Enter the range :");
        int n=s.nextInt();
        table2(n);
    }

    private static void table2(int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=10; j++) {
                int sum=i*j;
                System.out.print(sum+"  ");
            }
            System.out.println("  ");
        }
    }

    public static void table(){
        for (int i = 1; i <=10; i++) {
            for (int j = 1; j <=10; j++) {
                int sum=i*j;
                System.out.print(sum+"  ");
            }
            System.out.println("  ");
        }

    }

}
