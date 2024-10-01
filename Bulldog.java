public class Bulldog extends Dog {
    public Bulldog(int currentAge){
        super(currentAge);
        this.maturationAge = 6;
        this.adultWeight = 40;
}

@Override
        public void makeSound() {
            System.out.println("Bark! I am a Bulldog making a sound.");
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
            return super.toString() + "Bulldog";
    
        }

    }
