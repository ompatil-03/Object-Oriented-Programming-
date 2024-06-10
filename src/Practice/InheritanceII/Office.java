package Practice.InheritanceII;
class Employee{
    public void work(){
        System.out.println("Performing some tasks....");
    }
    public void getSalary(){
        System.out.println("The salary is 100000000");
    }
}
class HRManager extends Employee {
    public void work(){
        System.out.println("Doing some work.....");
    }
    public void addEmployee(){
        System.out.println("New Employee Added...");
    }
}
public class Office {
    public static void main(String[] args) {
            HRManager h=new HRManager();
            h.work();
            h.getSalary();
            h.addEmployee();
    }
}
