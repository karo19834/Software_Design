package at.campus02.myadapter;

public class Stockente implements Duck{
    @Override
    public void quack() {
        System.out.println("Stockente sagt QUACK");
    }

    @Override
    public void fly() {
        System.out.println("Stockente fliegt");

    }
}
