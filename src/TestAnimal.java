public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        System.out.println("Outputs:");
        registry.getNormalCow().makeSound();  
        registry.getNormalSheep().makeSound(); 
        registry.getNormalHorse().makeSound(); 

        System.out.println("--------------------");

        System.out.println("Clone Output:");
        registry.getNormalCow().clone().makeSound();
        registry.createSheepClone().makeSound();
        registry.createHorseClone().makeSound();
    }
}