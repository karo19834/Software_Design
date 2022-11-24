package at.campus02.fernbedienungmanfred;

public class LichtAusKommando implements Kommando {

    private Licht licht;

    public LichtAusKommando(Licht l) {
        this.licht = l;
    }

    @Override
    public void ausfuehren() {
        licht.aus();
    }

    @Override
    public void undo() {
        licht.an();
    }
}
