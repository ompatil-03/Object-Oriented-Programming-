package Practice.InheritanceII;
class BankAccount{
    int amount=1000;
    public void deposit(){
        System.out.println(this.amount+" Amount is Deposited....");
    }
    public void withdrawn(){
        System.out.println("Amount is withdrawn......");
    }
}
class SavingAccount extends BankAccount{
    int amount=super.amount;
    public void deposit(int a){
        this.amount+=a;
        System.out.println("The amount deposited is "+a);

    }
    public void withdrawn(int b){
        if(this.amount<=100){
            System.out.println("Can't Withdraw ");
        }else{
            this.amount-=b;
            System.out.println("The amount withdrawn is "+ b);
        }
    }

}
public class Banking {
    public static void main(String[] args) {
        SavingAccount s=new SavingAccount();
        System.out.println("the total amount is "+s.amount);
        s.deposit(100);
        s.withdrawn(1000);
        s.withdrawn(10000);
    }
}
