package Encapsulation;

public class GetterSetter {
    private int rollNo;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public static void main(String[] args) {
        GetterSetter gs=new GetterSetter();
        gs.setName("Sham");
        gs.setRollNo(12);
        System.out.println("The name is: "+ gs.getName());
        System.out.println("The roll number is : "+gs.getRollNo());

    }
}
