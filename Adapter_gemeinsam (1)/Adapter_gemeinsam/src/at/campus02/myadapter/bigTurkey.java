package at.campus02.myadapter;

public class bigTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("Big Turkey GOBBLES");
    }

    @Override
    public void walk() {
        System.out.println("Big Turkey WALKS");
    }
}
