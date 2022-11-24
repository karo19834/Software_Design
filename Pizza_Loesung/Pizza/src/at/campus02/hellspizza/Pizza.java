package at.campus02.hellspizza;

public abstract class Pizza {
    private String name;

    public Pizza(String name_) {
        this.name = name_;
        System.out.println("Pizza: neue Pizza erstellt!");
    }
}
