package at.meinefirma.provision;

import java.util.ArrayList;
import java.util.List;

public class MitarbeiterManager {
    private List<Mitarbeiterin> mList = new ArrayList<>();
    private ProvisionsStrategie provisionsStrategie;

    public MitarbeiterManager(ProvisionsStrategie p){
        provisionsStrategie = p;
    }
    // Im Entenbeispiel haben wir die Strategie über den Konstruktor gesetzt.
    // Das passt wunderbar wen man nicht mehr vor hat diese zu ändern. In diesem
    // Beispiel soll es möglich sein auch später auf eine andere Provision zu
    // wechseln.
    public void setProvision(ProvisionsStrategie p){
        provisionsStrategie = p;
    }

    public void addMitarbeiterin(Mitarbeiterin m){
        mList.add(m);
    }
    public void berechneProvision(){
        if (provisionsStrategie != null){
            for(Mitarbeiterin m : mList){
                System.out.print(m.getName() + " ");
                System.out.println(provisionsStrategie.berechneProvision(m));
            }
        }
    }

}
