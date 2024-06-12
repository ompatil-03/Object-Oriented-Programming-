package Practice.Abstract;
abstract class Instrument{
    abstract void play();
    abstract void tune();
}
class Voline extends Instrument{
    @Override
    void play() {
        System.out.println("Playing voilin......");
    }
    @Override
    void tune() {
        System.out.println("Tuning voilin......");
    }
}
class Glockenspiel extends Instrument{
    @Override
    void play() {
        System.out.println("Playing Glockenspiel......");
    }
    @Override
    void tune() {
        System.out.println("Tuning Glockenspiel......");
    }
}
public class AbstractIX {
    public static void main(String[] args) {
        Instrument i1=new Voline();
        Instrument i2=new Glockenspiel();
        i1.play();
        i1.tune();
        System.out.println("------------------------");
        i2.play();
        i2.tune();
    }
}
