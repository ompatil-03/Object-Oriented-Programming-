package Constroctor;

public class DefaultAndParametrized {
    public  DefaultAndParametrized(){
        System.out.println("User Defined Constructor ");
    }
    public DefaultAndParametrized(int a){
        System.out.println("This is parametrized Constructor with Argument value of :"+ a);
    }
    public static void main(String[] args) {
        System.out.println("Main Method Started ");
        DefaultAndParametrized df=new DefaultAndParametrized();
        DefaultAndParametrized df1=new DefaultAndParametrized(5);
        System.out.println("Main Method End !!!!!");
    }
}
