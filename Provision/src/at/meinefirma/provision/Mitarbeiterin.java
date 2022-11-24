package at.meinefirma.provision;


public class Mitarbeiterin {
    private String name;
    private double umsatz;
    private double gewinn;
    public Mitarbeiterin(String n, double u, double g) {
        name = n;
        umsatz = u;
        gewinn = g;
    }
    public void setGewinn(double gewinn) {
        this.gewinn = gewinn;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setUmsatz(double umsatz) {
        this.umsatz = umsatz;
    }
    public double getGewinn() {
        return gewinn;
    }
    public String getName() {
        return name;
    }
    public double getUmsatz() {
        return umsatz;
    }
}
