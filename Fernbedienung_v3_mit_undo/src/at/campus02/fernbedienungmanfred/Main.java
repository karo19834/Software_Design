package at.campus02.fernbedienungmanfred;

public class Main {

    public static void main(String[] args) {

        System.out.println("Fernbedienung Manfred starting...");
        Fernbedienung fb = new Fernbedienung();
        Licht licht = new Licht(); // Licht ist unser Empfänger

        LichtAnKommando lichtAn = new LichtAnKommando(licht);
        fb.setKommando(1, lichtAn);
        fb.KnopfGedrueckt(1);
        fb.undoFernbedienung();
        fb.undoFernbedienung();

        //umprogrammieren
        fb.setKommando(2, new LichtAusKommando(licht));
        fb.KnopfGedrueckt(2 );

        //TV test
        TV tv= new TV();
        fb.setKommando(3, new TVKanalRaufKommando(tv));
        fb.setKommando(4, new TVKanalRunterKommando(tv));
        fb.KnopfGedrueckt(3);
        fb.KnopfGedrueckt(3);
        fb.KnopfGedrueckt(4); //runter kanal= 1
        fb.KnopfGedrueckt(4); // runter kanal solle 40 sein
        //fb.KnopfGedrueckt(5);
    }

}
