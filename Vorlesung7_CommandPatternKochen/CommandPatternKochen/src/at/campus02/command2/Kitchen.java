package at.campus02.command2;

import java.util.LinkedList;
import java.util.Queue;

public class Kitchen {
    private static Kitchen k = null;
    private Queue<Command> queue = new LinkedList<>();

    private Kitchen() {
    }

    public static Kitchen getInstance() {
        if (k == null) {
            System.out.println("Kitchen: erster Aufruf, erstelle Kitchen und uebergebe die Referenz...");
            k = new Kitchen();
        } else {
            System.out.println("Kitchen: Singleton wurde bereits erstellt, uebergebe die Referenz...");
        }
        return k;
    }

    public void add(Command c) {
        queue.add(c);
        System.out.println("Kitchen: fuege Bestellung hinzu...");
        if (queue.size() > 4) // wenn 5 oder mehr Bestellungen: Herd einschalten und kochen
        {
            System.out.println("Kitchen: mehr als 4 Bestellungen -> beginne zu kochen...");
            while (!queue.isEmpty()) {
                queue.remove().execute();
            }
        }

    }
}
