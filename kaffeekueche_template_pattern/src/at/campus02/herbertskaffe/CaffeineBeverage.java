package at.campus02.herbertskaffe;

public abstract class CaffeineBeverage {

    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected abstract void addCondiments(); // implement in sub class

    protected void pourInCup() {
        System.out.println("-giesze in Haeferl");
    }

    protected abstract void brew();

    protected void boilWater(){
        System.out.println("-koche Wasser");// implement in sub class
    }
}
