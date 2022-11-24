package at.meinefirma.provision;

public class UmsatzProvision implements ProvisionsStrategie {

    @Override
    public double berechneProvision(Mitarbeiterin m) {

        return m.getUmsatz() * 0.05;
    }

}
