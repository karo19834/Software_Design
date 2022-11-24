package at.campus02.hellspizza;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Hells Pizza!");
        PizzeriaGraz DonAlfredoHellsPizza_Graz = new PizzeriaGraz();
        Pizza p0 = DonAlfredoHellsPizza_Graz.getPizza("ASDASDDASD");
        Pizza p1 = DonAlfredoHellsPizza_Graz.getPizza("salami");
        Pizza p2 = DonAlfredoHellsPizza_Graz.getPizza("uhrturm");
        Pizza p3 = DonAlfredoHellsPizza_Graz.getPizza("kleinklein");
        //erstelle neue Pizzerria in Takern II
        PizzeriaTakernII pizzerriaTakernii = new PizzeriaTakernII();
        //erstelle neue Pizza in
        Pizza p4 = pizzerriaTakernii.getPizza("kleinklein");
    }


}
