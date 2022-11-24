package at.campus02.hellspizza;

public class PizzeriaTakernII extends HellsPizzakette {

    @Override
    public Pizza getPizza(String type) {
        Pizza p = super.getPizza(type); // Kann die Kette das zubereiten?
        if (p != null) {
            return p;
        } else if (type.equals("kleinklein")) { // nein, ist es eine lokale Pizza?
            return new KleinKleinPizza();
        } else { // auch nicht, returne "null"
            System.out.println("FEHLER IN FACTORY: Die Pizza \"" +
                    type + "\" gibt es nicht. Mache keine Pizza.");
            return null;
        }
    }
}
