package Methods.NOReturn;

public class DiamondPattern {
    public static void main(String[] args) {
        DiamondPattern d=new DiamondPattern();
        d.pattern();
    }
    public void pattern(){
        int n=7;
        int as=65;
        for (int i = 1; i <=n; i++) {

                for (int j = n; j >=i; j--) {
                    System.out.print(" ");
                }
                for (int j = (i-1)*2+1; j>=1 ; j--) {
                    if (j==1||j==(i-1)*2+1) {
                        System.out.print("*");
                    } else if (j==2||j==(i-1)*2) {
                        System.out.print((char) (as++));
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
        }
        for (int i = 2; i <=n; i++) {

            for (int j =1; j <=i; j++) {
                System.out.print(" ");
            }
            for (int j = (n-2)*2+2; j>=(i-1)*2 ; j--) {
                if (j==(i-1)*2||j==(n-2)*2+2) {
                    System.out.print("*");
                } else if (j==(i-1)*2+1||j==(n-2)*2+1) {
                    System.out.print((char) (as++));
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
}
