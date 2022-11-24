package at.campus02.fernbedienungmanfred;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Fernbedienung {

    private Map<Integer, Kommando> slots = new HashMap<Integer, Kommando>();
    private Stack<Kommando> history = new Stack<>();

    public void setKommando(Integer slotnummer, Kommando k) {
        slots.put(slotnummer, k);
    }

    public void KnopfGedrueckt(Integer slotnummer) {
        if (slots.containsKey(slotnummer)) {
            Kommando k = slots.get(slotnummer);
            k.ausfuehren();
            history.push(k); // History befüllen
        } else { // Slot existiert nicht
            System.out.println("Fernbedienung: ERROR: slot " +
                    slotnummer + " nicht vergeben.");
        }
    }
    public void undoFernbedienung() {
        System.out.println("Fernbedienung: \"UNDO\" aufgerufen.");
        if (history.isEmpty()) {
            System.out.println("Fernbedienung: ERROR: History ist leer.");
        } else {
            Kommando letztesK = history.pop();  // vom Stapel geholt
            letztesK.undo(); // undo it
        }
    }
}
