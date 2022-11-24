package at.campus02.fernbedienungmanfred;

public class LichtAnKommando implements Kommando {

    private Licht licht;

    public LichtAnKommando(Licht l) {
        this.licht = l;
    }

    @Override
    public void ausfuehren() {
        licht.an();
    }
}
