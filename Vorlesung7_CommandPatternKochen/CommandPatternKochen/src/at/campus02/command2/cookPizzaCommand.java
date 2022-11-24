package at.campus02.command2;

public class cookPizzaCommand implements Command {
    @Override
    public void execute() {
        System.out.println("-cookPizzaCommand: Koche PIZZA");
    }
}
