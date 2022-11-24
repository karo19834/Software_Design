package at.campus02.herbertskaffe;

public class Tea extends CaffeineBeverage{
    @Override
    protected void addCondiments() {
        System.out.println("-Tea: Fuege Zitronensaft hinzu");
    }

    @Override
    protected void brew() {
        System.out.println("-Tea: Teeblaetter werden im Wasser gebrueht");
    }
}
