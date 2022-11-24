package at.campus02.zamcafe;

public class Milch extends ZutatDecorator{

    public Milch(Getraenk getraenk) {
        super(getraenk);
    }

    @Override
    public double kostet() {
        return .5 + getraenk.kostet();
    }

    @Override
    public String getBeschreibung() {
        return getraenk.getBeschreibung() + ", Milch";
    }
}
