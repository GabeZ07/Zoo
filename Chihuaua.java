public class Chihuaua extends Dog {
    public Chihuaua(int currentAge){
        super(currentAge);
        this.maturationAge = 4;
        this.adultWeight = 15;
}

@Override
        public String makeSound() {
            return ("Bark! I am a Bulldog making a sound.");
        }

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