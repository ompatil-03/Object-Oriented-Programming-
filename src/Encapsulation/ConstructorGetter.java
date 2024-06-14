package Encapsulation;
class  Student{
    private String name;
    private int rollNo;


    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }
}
public class ConstructorGetter {
    public static void main(String[] args) {
            Student s1=new Student("Ram",1);
            Student s2=new Student("Sham",2);
             System.out.println(s1.getRollNo()+"  "+s1.getName());
        System.out.println(s2.getRollNo()+"  "+s2.getName());

    }
}
