package Practice.Abstract;
abstract class Bank{
    abstract void deposit();
    abstract void withdraw();
}
class SavingsAccount extends Bank{
    int n=5000;
    @Override
    void deposit() {
        System.out.println("Your Savings account balance is :"+n);
        System.out.println("1000 deposited ");
        this.n+=1000;
        System.out.println("Your Current balance is "+(this.n));
    }

    @Override
    void withdraw() {

        System.out.println("4000 credited.... ");
        this.n-=4000;
        System.out.println("Your Current balance is "+(this.n));
    }
}
class CurrentAccount extends Bank{
   int n=7000;
    @Override
    void deposit() {
        System.out.println("Your current account balance is :"+n);
        System.out.println("1000 deposited ");
        this.n+=1000;
        System.out.println("Your Current balance is "+(this.n));
    }

    @Override
    void withdraw() {

        System.out.println("4000 credited.... ");
        this.n-=4000;
        System.out.println("Your Current balance is "+(this.n));
    }
}
public class AbstractIII {
    public static void main(String[] args) {
         Bank b=new CurrentAccount();
        System.out.println("Current account ----->");
         b.deposit();
         b.withdraw();
        System.out.println("====================================");
        System.out.println("Savings Account ------->");
        Bank c=new SavingsAccount();
        c.withdraw();
        c.deposit();
    }
}
