package at.entensimulation.v2;

public class Gummiente extends Ente {
    public Gummiente(String name){
        super(name, 3);
    }

    @Override
    public void anzeigen() {
        System.out.println("Ist scheu und lässt sich nicht blicken");
    }
    @Override
    public void quaken() {
        System.out.println("Macht quietsch quietsch");
    }

}
