package at.meinefirma.provision;

public class Main {
    public static void main(String[] args) {
        MitarbeiterManager mgr = new MitarbeiterManager(new UmsatzProvision());

        mgr.addMitarbeiterin(new Mitarbeiterin("Susi", 10000, 2000));
        mgr.addMitarbeiterin(new Mitarbeiterin("Strolchi", 30000, 5000));
        mgr.addMitarbeiterin(new Mitarbeiterin("Susanne", 200000, 30000));

        mgr.berechneProvision();
        System.out.println("---------------------");
        // und jetzt möchte ich auf basis des gewinns
        mgr.setProvision(new GewinnProvision());
        mgr.berechneProvision();
    }
}
