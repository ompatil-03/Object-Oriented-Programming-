package Practice.Polymorphisam;
class Sports{
   public void play(){
       System.out.println("Playing Sports......");
   }
}
class FootBall extends Sports{
    public void play(){
        System.out.println("Playing Football......");
    }
}
class Rugby extends Sports{
    public void play(){
        System.out.println("Playing Rugby......");
    }
}
class BasketBall extends Sports{
    public void play(){
        System.out.println("Playing BasketBall......");
    }
}
public class Override5 {
    public static void main(String[] args) {
        Sports s1=new BasketBall();
        s1.play();
        Sports s2=new FootBall();
        s2.play();;
        Sports s3=new Rugby();
        s3.play();
    }
}
