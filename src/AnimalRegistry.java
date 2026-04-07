public class AnimalRegistry {
    private Sheep normalSheep = new Sheep();
    private Cow normalCow = new Cow();
    private Horse normalHorse = new Horse();

    // Returns the unmodified prototypes
    public Animal getNormalSheep() { return normalSheep; }
    public Animal getNormalCow() { return normalCow; }
    public Animal getNormalHorse() { return normalHorse; }

    // Returns modified clones
    public Animal createSheepClone() {
        Sheep s = (Sheep) normalSheep.clone();
        s.setName("Shaun"); 
        return s;
    }

    public Animal createHorseClone() {
        Horse h = (Horse) normalHorse.clone();
        h.setColor("Black");
        return h;
    }
}