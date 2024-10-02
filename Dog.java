class Dog extends Animal {
    
    
    public Dog(int currentAge){
        super(2, 45, currentAge, 1000, 0);

    }
    
    @Override
        public String makeSound() {
            return ("Bark! I am a Dog making a sound.");
        }
    @Override
        public void eat(Food food){
            caloriesConsumed =+ 200;
        }
    @Override
        public String toString(){
            if(isAdult() == true){
            }
            else if (isAdult() == false){
            }
            return super.toString() + "Dog";
    
        }
}
