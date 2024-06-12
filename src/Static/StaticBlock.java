package Static;

public class StaticBlock {
    static {
        System.out.println("Static block executed......");
    }
    {
        System.out.println("Default block executed......");
    }

    public StaticBlock() {
        System.out.println("Constructor initialized...");
    }
    public void add(){
        System.out.println("Another method is executed.....");
    }
    public static void main(String[] args) {
        System.out.println("Main method started.......");
        System.out.println("-------------------------");
        StaticBlock sb=new StaticBlock();
        sb.add();
        System.out.println("--------------------------");
        System.out.println("Main method completed.....");

    }
}
