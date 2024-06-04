package Constroctor;

public class ThisKeyword {
    int a, m1,m2;
    public ThisKeyword(int a,int m1,int m2){
        this.a=a;
        this.m1=m1;
        this.m2=m2;
    }
    public void DisplayMarks(){
        int c=m1+m2;
        System.out.println("The total marks of Student "+a+" are "+c);
    }
    public static void main(String[] args) {
        ThisKeyword tk=new ThisKeyword(1,99,82);
        tk.DisplayMarks();
        ThisKeyword tk1=new ThisKeyword(2,20,62);
        tk1.DisplayMarks();
        ThisKeyword tk2=new ThisKeyword(3,36,12);
        tk2.DisplayMarks();

    }
}
