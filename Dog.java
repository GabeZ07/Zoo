public class Dog extends Animal {
    
    
    public Dog(int currentAge){
        super(2, 45, currentAge);

    }
    
    @Override
        public void makeSound() {
            System.out.println("Bark! I am a Dog making a sound.");
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
            return super.toString() + "Dog";
    
        }
}
