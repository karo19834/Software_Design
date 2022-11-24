package at.campus02.hellspizza;

// Hätte, Hätte, Pizzakette
public abstract class HellsPizzakette {
    public Pizza getPizza(String type) {

        if (type.equals("cheese")) {
            return new CheesePizza();
        } else if (type.equals("salami")) {
            return new SalamiPizza();
        } else {

            return null;
        }
    }
}
