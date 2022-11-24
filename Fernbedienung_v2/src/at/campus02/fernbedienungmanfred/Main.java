package at.campus02.fernbedienungmanfred;

public class Main {

    public static void main(String[] args) {

        System.out.println("Fernbedienung Manfred starting...");
        EinfacheFernbedienung fb = new EinfacheFernbedienung();
        Licht licht = new Licht(); // Licht ist unser Empfänger
        LichtAnKommando lichtAn = new LichtAnKommando(licht);
        fb.setKommando(lichtAn);
        fb.KnopfGedrueckt();
        //umprogrammieren
        fb.setKommando(new LichtAusKommando(licht));
        fb.KnopfGedrueckt();

    }

}
