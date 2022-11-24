package at.campus02.zamcafe;

// das ist meine Komponente im decorator pattern

public abstract class Getraenk {
    protected String beschreibung = "Unbekanntes Getraenk"; //protected: abgeleitete Klasse kann darauf zugreifen

    public String getBeschreibung(){
        return beschreibung;
    }

    public abstract double kostet();
}
