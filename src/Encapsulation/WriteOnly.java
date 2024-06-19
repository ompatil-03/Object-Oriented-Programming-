package Encapsulation;

import java.util.Random;
import java.util.Scanner;

class Students{
    private int rollNo;
    private String name;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void info() {
        System.out.println("The rollNumber is :"+rollNo+" and name is : "+name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class WriteOnly {
    public static void main(String[] args) {
        System.out.println("Enter roll number :");
        Scanner s=new Scanner(System.in);
        int rollNo=s.nextInt();
        Students s1=new Students();
        s1.setRollNo(rollNo);
        System.out.println("Enter name");
        String name =s.next();
        s1.setName(name);
        s1.info();
   
    }
}
