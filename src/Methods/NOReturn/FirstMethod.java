package Methods.NOReturn;

import java.util.Scanner;

public class FirstMethod {
    public static void main(String[] args) {
        FirstMethod f=new FirstMethod();
        f.pd();
    }
    public void pd(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=s.nextInt();
        int count=0;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                count++;
            }
        }
        if (count==0 && n!=1){
            System.out.println("Prime number");
        }else{
            System.out.println("Not Prime ");
        }
    }
}
