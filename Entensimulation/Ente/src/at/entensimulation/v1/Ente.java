package at.entensimulation.v1;

public abstract class Ente {
    private String name;

    public Ente(String name){
        this.name = name;
    }

    public void quaken(){
        System.out.println("Ente " + name + " quakt");
    }

    public void schwimmen(){
        System.out.println("Ente " + name + " schwimmt");
    }

    public void fliegen(){
        System.out.println("Ente " + name + " fliegt");
    }
    public abstract void anzeigen();
}
