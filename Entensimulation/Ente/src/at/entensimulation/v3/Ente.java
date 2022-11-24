package at.entensimulation.v3;

public abstract class Ente {
    private String name;
    private Flugverhalten flugVerhalten;

    public Ente(String name, Flugverhalten fV){
        this.name = name;
        flugVerhalten = fV;
    }

    public void quaken(){
        System.out.println("Ente " + name + " quakt");
    }

    public void schwimmen(){
        System.out.println("Ente " + name + " schwimmt");
    }


    public void performFliegen(){
        if(flugVerhalten != null){
            flugVerhalten.fliegen();
        }
    }
    public abstract void anzeigen();
}
