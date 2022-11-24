package at.entensimulation.v3;

public class Stockente extends Ente {
    public Stockente(String name){
        super(name, new Flatterflugverhalten());
    }

    @Override
    public void anzeigen() {
        System.out.println("Stockente stolpert über Stock");
    }

}
