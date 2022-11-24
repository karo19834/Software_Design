package at.campus02.fernbedienungmanfred;

public class TVKanalRunterKommando implements Kommando {
    private TV tv;

    public TVKanalRunterKommando(TV tv) {
        this.tv = tv;
    }

    @Override
    public void ausfuehren() {
        if(tv.istEin() == false) { // TV ist ausgeschaltet
            tv.an();
            System.out.println("TVKanalRunterKommando: TV war ausgeschaltet, jetzt ist er ein.");
        }
        else { // TV ist ein
            tv.runter();
        }
    }

    @Override
    public void undo() {
        tv.runter();
    }
}
