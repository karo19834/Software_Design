package at.campus02.herbertskaffe;

public class Coffee extends CaffeineBeverage{
    @Override
    protected void addCondiments() {
        System.out.println("-Coffee: fuege Milch und Zucker hinzu");
    }
@Override
    protected void boilWater()
{
    System.out.println("KOCHE MIT KALTEM WASSER");
}
    @Override
    protected void brew() {
        System.out.println("-Coffee: Espressokaennchen auf Herd erhitzen");
    }
}
