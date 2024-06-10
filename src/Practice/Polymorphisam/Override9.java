package Practice.Polymorphisam;
class Bank{
    int balance=1000;
    public void withdraw(int x){
        balance-=x;
        System.out.println("You withdrawn "+x+" rupees ");
    }
}
class SavingsAccount extends Bank{
    int balance=super.balance;
    public void withdraw(int x){
        System.out.println("Your account balance is :"+balance);
        if(balance<100){
            System.out.println("Your savings account balance is less then 100");
            System.out.println("You can not withdraw...");
        } else if (x>balance) {
            System.out.println("Exceeds transaction limit");
        } else{
            balance-=x;
            System.out.println(x+" rupees are debited from you savings account.");
            System.out.println("Your new Saving account balance is "+balance);
        }
    }
}
class CheckingAccount extends Bank{
    int balance=super.balance;
    public void withdraw(int x){
        System.out.println("Your account balance is :"+balance);
        if(balance<100){
            System.out.println("Your checking account balance is less then 500");
            System.out.println("You can not withdraw...");
        }else if (x>balance) {
            System.out.println("Exceeds transaction limit");
        }
        else {
            balance-=x;
            System.out.println(x+" rupees are debited from you checking account.");
            System.out.println("Your new Checking account balance is "+balance);
        }
    }
}
public class Override9 {
    public static void main(String[] args) {
        Bank b1=new SavingsAccount();
        b1.withdraw(100);
        System.out.println("-----------------------");
        Bank b2=new CheckingAccount();
        b2.withdraw(600);
    }
}
