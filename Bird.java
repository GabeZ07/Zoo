class Bird extends Animal {

    public Bird(int currentAge){
        super(8, 100, currentAge, 200, 0);

    }
    @Override
    public String makeSound() {
        return ("Chirp! I am a Bird making a sound.");
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
        return super.toString() + "Bird";

    }
}