package Practice.InheritanceII;

class Employeess {
    String name;
    String address;
    double salary;
    String jobTitle;

    public Employeess(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public void calculateBonus() {
        System.out.println("The bonus is being  calculated.");
    }

    public void generatePerformanceReport() {
        System.out.println("Generating performance report.");
    }

    public void manageProject(String projectName) {
        System.out.println(this.jobTitle + " " + this.name + " is managing the project: " + projectName);
    }
}

class Manager extends Employeess {

    public Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    public void calculateBonus() {
        System.out.println("Manager " + this.name + "'s bonus: " + (this.salary * 0.20));
    }

    public void generatePerformanceReport() {
        System.out.println("Manager " + this.name + "'s performance report.");
    }
}

class Developer extends Employeess {

    public Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    public void calculateBonus() {
        System.out.println("Developer " + this.name + "'s bonus: " +(this.salary * 0.15));
    }

    public void generatePerformanceReport() {
        System.out.println("Developer " + this.name + "'s performance report.");
    }
}

class Programmer extends Employeess {

    public Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    public void calculateBonus() {
        System.out.println("Programmer " + this.name + "'s bonus: " +(this.salary * 0.10));
    }

    public void generatePerformanceReport() {
        System.out.println("Programmer " + this.name + "'s performance report.");
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Manager manager = new Manager("John", "Pune", 90000);
        Developer developer = new Developer("Ram", "Mumbai", 80000);
        Programmer programmer = new Programmer("Tom", "Sangli", 70000);

        System.out.println("For Manager:");
        manager.calculateBonus();
        manager.generatePerformanceReport();
        manager.manageProject("Project Alpha");

        System.out.println("---------------");

        System.out.println("For Developer:");
        developer.calculateBonus();
        developer.generatePerformanceReport();
        developer.manageProject("Project Beta");

        System.out.println("---------------");

        System.out.println("For Programmer:");
        programmer.calculateBonus();
        programmer.generatePerformanceReport();
        programmer.manageProject("Project Gamma");
    }
}
