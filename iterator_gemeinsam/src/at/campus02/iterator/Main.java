package at.campus02.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> meineListe = new ArrayList<>();

        meineListe.add("a");
        meineListe.add("b");
        meineListe.add("c");

        System.out.println("Inhalt von meineListe:");

        for (String listElement: meineListe) {
            System.out.println("Eintrag: " + listElement);
        }

        //-------------------------
        System.out.println("-------------mit eigener Liste-------------");

        ZamList meineZAMListe = new ZamList("Hallo liebe ZAM es ist Nachmittag aber wir sind noch fleiszig");

        int i=0;
        for (String listElement: meineZAMListe) {
            System.out.println("Eintrag ZAMList "+ i++ + ": " + listElement);
        }

        // nochmal durchgehen, mit explizitem Iterator
        System.out.println("-------------mit explizitem Iterator-------------");

        Iterator<String> meinZamListIterator = meineZAMListe.iterator();
        i=0;
        while(meinZamListIterator.hasNext()) {
            System.out.println("Eintrag ZAMList mit ITERATOR "+ i++ + ": " + meinZamListIterator.next());
        }

    }
}
