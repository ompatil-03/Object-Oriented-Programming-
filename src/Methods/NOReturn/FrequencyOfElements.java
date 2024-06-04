package Methods.NOReturn;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] a={1,1,2,3,2,5,5,5,4,4,6};
        System.out.println("Origale Array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        FrequencyOfElements fe=new FrequencyOfElements();
        fe.frequency(a);
    }
    public void frequency(int[] a){
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if(a[i]!=-10) {
                System.out.print("The Frequency of "+a[i]+" is ");
                int count=0;
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        count++;
                        a[j] = -10;
                    }
                }
                System.out.println(count+1);
            }


        }
    }
}
