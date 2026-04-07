public class Sheep implements Animal {
    private String name = "Dolly";

    public void setName(String name) { this.name = name; }
    public void setColor(String color) {}

    @Override
    public Animal clone() {
        try { return (Sheep) super.clone(); } 
        catch (CloneNotSupportedException e) { return null; }
    }

    @Override
    public void makeSound() { System.out.println("Sheep: " + name); }
}