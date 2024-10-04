public class Bulldog extends Dog {
    public Bulldog(int currentAge){
        super(currentAge);
        this.maturationAge = 6;
        this.adultWeight = 40;
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
            return super.toString() + "Bulldog";
    
        }

    }
