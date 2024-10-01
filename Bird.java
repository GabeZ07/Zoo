class Bird extends Animal {

    public Bird(int currentAge){
        super(8, 100, currentAge);

    }
    @Override
    public void makeSound() {
        System.out.println("Chirp! I am a Bird making a sound.");
    }
    @Override
    public void eat(){
        System.out.println("im eating");
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