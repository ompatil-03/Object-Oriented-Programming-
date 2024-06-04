package AccessModifiers;

import Constroctor.ProtectedDefaultOutsidePackage;
class PD{
    protected int p=22;
    int j=84;
}
public class ProtectedAndDefault extends ProtectedDefaultOutsidePackage {
    public static void main(String[] args) {
        System.out.println("Outside the class :");
        PD p=new PD();
        System.out.println("The value of Protected variable  is :"+p.p);
        System.out.println("The value of default variable is :"+p.j);
        System.out.println("----------------------------------------------");
        System.out.println("Outside the Package :");
        ProtectedAndDefault pf=new ProtectedAndDefault();
        System.out.println("The value outside the package of protected variable using inheritance is :"+pf.a);
        //System.out.println("The value outside the package of default variable is :"+pf.b);
        System.out.println("Can NOT access default outside the package.....");

    }
}
