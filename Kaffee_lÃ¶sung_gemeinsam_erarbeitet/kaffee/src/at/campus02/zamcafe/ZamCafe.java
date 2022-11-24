package at.campus02.zamcafe;

import static java.lang.Math.exp;

public class ZamCafe {

    public static void main(String[] args) {

    //    Getraenk l1= new CafeLatte();
    //    Getraenk s = new Sirup(l1);
    //    Milch m = new Milch(s);


        Getraenk g = new Espresso();
        g = new Milch(g);
        g = new Milch(g);
        g = new Sirup(g);

        System.out.println(g.getBeschreibung());
        System.out.println(g.kostet());
    }

}
