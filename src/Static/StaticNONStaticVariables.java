package Static;

public class StaticNONStaticVariables {
    int a=10;
    static int b=20;
    public static void main(String[] args) {
        System.out.println("The static variable inside static method: "+b);
        System.out.println("------------------------------------------");
        StaticNONStaticVariables s1=new StaticNONStaticVariables();
        s1.add();
    }

    public void add(){
        System.out.println("The static variable inside non-static method: "+b);
        System.out.println("The non-static variables inside non static method:"+a);
    }
}
