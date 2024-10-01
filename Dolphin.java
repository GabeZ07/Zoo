
public class Dolphin extends Animal {

    public Dolphin(int currentAge){
        super(8, 100, currentAge);

    }
    @Override
        public void makeSound() {
            System.out.println("Click! I am a Dolphin making a sound.");
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
            return super.toString() + "Dolphin";
    
        }
}
