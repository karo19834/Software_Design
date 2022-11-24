package at.campus02.fernbedienungmanfred;

public class TVKanalRaufKommando implements Kommando {
    private TV tv;

    public TVKanalRaufKommando(TV tv) { this.tv = tv;   }

    @Override
    public void ausfuehren() {
        if(tv.istEin() == false) { // TV ist ausgeschaltet
            tv.an();
            System.out.println("TVKanalRaufKommando: TV war ausgeschaltet. Jetzt ist er an.");
        }
        else { // TV ist ein
            tv.rauf();
        }
    }

    @Override
    public void undo() {
        tv.runter();
    }
}
