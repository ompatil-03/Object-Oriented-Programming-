package Practice.Polymorphisam;
class Employee{
    public void salary(){
        System.out.println("The salary of employee is high");
    }
}
class Manager extends Employee{
    public void salary(){
        System.out.println("The salary of Manager is 10,00,000");
    }
}
class Developer extends Employee{
    public void salary(){
        System.out.println("The salary of Developer is 8,00,000");
    }
}
public class Override4 {
    public static void main(String[] args) {
        Employee e1=new Manager();
        e1.salary();
        Employee e2=new Developer();
        e2.salary();
    }
}
