package at.campus02.zamcafe;

public class CafeLatte extends Getraenk {
    public CafeLatte(){
        beschreibung = "Cafe Latte";
    }

    @Override
    public double kostet() {
        return 3.60;
    }
}
