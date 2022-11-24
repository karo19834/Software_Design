package at.campus02.command2;

public class Main {
    public static void main(String[] args) {
        Kitchen k = Kitchen.getInstance();
        k.add(new cookPizzaCommand());
        k.add(new cookEggCommand());
        k.add(new cookPizzaCommand());
        k.add(new cookEggCommand());
        k.add(new cookSpinachCommand()); // 5

        k.add(new cookPizzaCommand());
        k.add(new cookEggCommand());
        k.add(new cookPizzaCommand());
    }
}
