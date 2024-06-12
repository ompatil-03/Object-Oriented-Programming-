package Practice.Abstract;
abstract class Employee{
    abstract void calculateSalary();
    abstract void getInfo();
}
class Programmer extends Employee{
    @Override
    void calculateSalary() {
        System.out.println("The salary is 100000000");
    }
    @Override
    void getInfo() {
        System.out.println("This is a programmer");
    }
}
class Manager extends Employee{
    @Override
    void calculateSalary() {
        System.out.println("The salary is 400000000");
    }
    @Override
    void getInfo() {
        System.out.println("This is a manager");
    }
}
public class AbstractV {
    public static void main(String[] args) {
        Programmer p=new Programmer();
        p.calculateSalary();
        p.getInfo();
        Manager m=new Manager();
        m.calculateSalary();
        m.getInfo();
    }
}
