public class Cow implements Animal {
    private String sound = "Moo";

    public void setName(String name) {} 
    public void setColor(String color) {}

    @Override
    public Animal clone() {
        try { return (Cow) super.clone(); } 
        catch (CloneNotSupportedException e) { return null; }
    }

    @Override
    public void makeSound() { System.out.println("Cow: " + sound); }
}