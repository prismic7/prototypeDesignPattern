public class Horse implements Animal {
    private String color = "Brown";

    public void setName(String name) {}
    public void setColor(String color) { this.color = color; }

    @Override
    public Animal clone() {
        try { return (Horse) super.clone(); } 
        catch (CloneNotSupportedException e) { return null; }
    }

    @Override
    public void makeSound() { System.out.println("Horse: " + color); }
}