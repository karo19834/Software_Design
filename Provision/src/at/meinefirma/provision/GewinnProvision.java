package at.meinefirma.provision;

public class GewinnProvision implements ProvisionsStrategie {
    @Override
    public double berechneProvision(Mitarbeiterin m) {
        return m.getGewinn() * 0.1;
    }
}
