public interface Animal extends Cloneable {
    Animal clone();
    void makeSound();
    void setName(String name);
    void setColor(String color);
}