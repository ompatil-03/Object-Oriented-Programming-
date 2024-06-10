package Inheritance;
class p{
    int id;
    String name;
    public  p(int id,String name){
        this.id=id;
        this.name=name;
    }
}
class c extends p{
    double salary;
    public c(int id, String name,int salary) {
        super(id, name);
        this.salary=salary;

    }
    public void display(){
        System.out.println("The id of employee is :"+this.id);
        System.out.println("The name of employee is :"+this.name);
        System.out.println("The salary of employee is :"+this.salary);
    }
}
public class SuperConstructor {
    public static void main(String[] args) {
        c emp=new c(1,"Rambo",1000000);
        emp.display();

    }
}
