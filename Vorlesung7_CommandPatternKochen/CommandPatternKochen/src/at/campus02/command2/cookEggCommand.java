package at.campus02.command2;

public class cookEggCommand implements Command {
    @Override
    public void execute() {
        System.out.println("-cookEggCommand: Koche EGG");
    }
}
