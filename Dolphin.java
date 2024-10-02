
class Dolphin extends Animal {

    public Dolphin(int currentAge){
        super(8, 100, currentAge, 3000, 0);

    }
    @Override
        public String makeSound() {
            return ("Click! I am a Dolphin making a sound.");
        }
    @Override
    public void eat(Food food){
        if(food.getVegetarian() == true){
            caloriesConsumed += 20;
        }
    }
    @Override
        public String toString(){
            if(isAdult() == true){
            }
            else if (isAdult() == false){
            }
            return super.toString() + "Dolphin";
    
        }
}
