package at.entensimulation.v2;

import java.sql.SQLOutput;

public abstract class Ente {
    private String name;
    private int flugVerhalten;

    public Ente(String name, int fV){
        this.name = name;
        flugVerhalten = fV;
    }

    public void quaken(){
        System.out.println("Ente " + name + " quakt");
    }

    public void schwimmen(){
        System.out.println("Ente " + name + " schwimmt");
    }

    /*
          - Bei Erweiterung müsesn wir immer dieses (sonst schon funktionsfähige) Objekt anpassen
            (wir könnten ja unabsichtlich einen Fehler in bestehenden funktionsfähigen Code einbauen)
          - Methode wird sehr lange und unübersichtlich
          - Wiederverwendbarkeit eingeschränkt (Hühner in Simulation?)
     */
    public void fliegen(){
        switch(flugVerhalten){
            case 1:
                System.out.println("Ente " + name + " flattert");
                break;
            case 2:
                System.out.println("Ente " + name + " segelt durch den Wind");
                break;
            case 3:
                System.out.println("Ente " + name + " kommt nicht vom Boden");
                break;
        }
    }
    public abstract void anzeigen();
}
