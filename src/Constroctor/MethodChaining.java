package Constroctor;

public class MethodChaining {
    public static void main(String[] args) {
        System.out.println("Example of Method chaining :");
      MethodChaining mc=new MethodChaining();
      mc.even();
    }
    public  void even(){
        System.out.println("Even Numbers are :");
        for (int i = 0; i < 51; i++) {
            if(i%2==0){
                System.out.print(i+"  ");
            }
        }
        this.odd();
    }
    public  void odd(){
        System.out.println("\nThe odd numbers are :");
        for (int i = 0; i < 51; i++) {
            if(i%2==1){
                System.out.print(i+"  ");
            }
        }
    }
}
