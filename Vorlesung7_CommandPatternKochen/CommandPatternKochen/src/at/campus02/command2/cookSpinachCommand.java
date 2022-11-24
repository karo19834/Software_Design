package at.campus02.command2;

public class cookSpinachCommand implements Command {
    @Override
    public void execute() {
        System.out.println("-cookSpinachCommand: Koche SPINACH");
    }
}
