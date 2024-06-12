package Static;
class Student{
    int id;
    String name;
    static  String  collegeName="Codenera";
    public Student(int id,String name){
        this.id=id;
        this.name=name;

    }

}

public class StaticVAR {
    public static void main(String[] args) {
        Student s1=new Student(1,"Ram");
        Student s2=new Student(2,"Sham");
        Student s3=new Student(3,"Tom");
        Student s4=new Student(4,"John");
        System.out.println(s1.name+" "+s1.id+" "+Student.collegeName);
        System.out.println(s2.name+" "+s2.id+" "+Student.collegeName);
        System.out.println(s3.name+" "+s3.id+" "+Student.collegeName);
        System.out.println(s4.name+" "+s4.id+" "+Student.collegeName);
    }
}
