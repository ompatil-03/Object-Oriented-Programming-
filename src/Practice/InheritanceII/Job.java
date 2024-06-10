package Practice.InheritanceII;
class Person{
    public void getFirstName(){
        System.out.println("The first name is JOHN ");
    }
    public void getLastName(){
        System.out.println("The Last name is  WICK");
    }
}
class NewEmployee extends Person{
    public void getLastName(){
        System.out.println("Software Developer ");
    }
    public void getEmployeeId(){
        System.out.println("The Employee Id is 1");
    }
}
public class Job {
    public static void main(String[] args) {
        NewEmployee np= new NewEmployee();
        np.getEmployeeId();
        np.getFirstName();
        np.getLastName();
    }
}
