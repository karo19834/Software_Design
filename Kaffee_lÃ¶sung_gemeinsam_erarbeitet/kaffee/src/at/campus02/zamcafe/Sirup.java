package at.campus02.zamcafe;

public class Sirup extends ZutatDecorator {

    public Sirup(Getraenk getraenk) {
        super(getraenk);
    }

    @Override
    public String getBeschreibung() {
        return getraenk.getBeschreibung() + ", Sirup";
    }

    @Override
    public double kostet() {
        return .5 + getraenk.kostet();
    }

}
