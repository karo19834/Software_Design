package at.entensimulation.v3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Ente> entenhausen = new ArrayList<Ente>();

        entenhausen.add(new Stockente("Donald"));
        entenhausen.add(new Rotkopfente("Daisy"));
        entenhausen.add(new Stockente("Dagobert"));
        entenhausen.add(new Gummiente("Sir Quietschalot"));

        for(Ente e : entenhausen){
            e.anzeigen();
            e.performFliegen();
        }
    }
}
