package Practice.InheritanceII;

public class Test
{
        public Test(){
            this(4);
            System.out.println("Fuck off!!!!!!!!!!");
        }
        public Test(int a){
            System.out.println("The arg value is :"+a);
        }
        public static void disp1(){
            System.out.println("Supriese mother father ");
        }
        public void dip2(){
            System.out.println("hell yheee");
        }

    public static void main(String[] args) {
            Test t=new Test();
            Test.disp1();
            t.dip2();
            t.disp1();
    }
}
