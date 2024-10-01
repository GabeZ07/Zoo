public class Chihuaua extends Dog {
    public Chihuaua(int currentAge){
        super(currentAge);
        this.maturationAge = 4;
        this.adultWeight = 15;
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
            return super.toString() + "Chihuaua";
    
        }

    }