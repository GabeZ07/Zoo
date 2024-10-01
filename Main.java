public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(5);
        Dolphin dolphin = new Dolphin(9);
        Bird bird = new Bird(1);

        Zoo zoo = new Zoo();

        zoo.addAnimal(bird);
        zoo.addAnimal(dog);
        zoo.addAnimal(dolphin);
    }
    


}
