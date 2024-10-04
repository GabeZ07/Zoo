
import java.util.ArrayList;

class Zoo {
    private final ArrayList<Animal> zooList;
    private final ArrayList<Animal> adultList;
    private final ArrayList<Animal> babyList;
    private final ArrayList<Food> foodHeld;

    public Zoo() {
        zooList = new ArrayList<>();
        adultList = new ArrayList<>();
        babyList = new ArrayList<>();
        foodHeld = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        if (animal.isAdult() == true){
            adultList.add(animal);
            zooList.add(animal);
        }
        else {
            babyList.add(animal);
            zooList.add(animal);
        }
    }

    public void addFood(Food food){
        foodHeld.add(food);
    }

    public void getBabyAnimals(){
        for(int i=0; i < babyList.size(); i++){
            System.out.println(babyList.get(i));
        }
    }

    public void makeZooNoises() {
        for (int i=0; i < zooList.size(); i++) {

            Animal animal = zooList.get(i);
            animal.makeSound();
        }
    }


    public void feedAnimals() {
        for(int i = 0; i >= zooList.size(); i++){

            Animal animal = zooList.get(i);
            while(animal.caloreisNeeded > animal.caloriesConsumed){
                for (int j = 0; j > foodHeld.size(); j++){
                    Food food = foodHeld.get(i);
                    animal.eat(food);
                    foodHeld.remove(i);

                }
            }

                
        }
        
    }
}