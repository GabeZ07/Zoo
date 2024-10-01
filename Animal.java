public class Animal {
    protected int maturationAge;
    protected double adultWeight;
    protected int currentAge;

    public Animal(int maturationAge, double adultWeight, int currentAge){
        this.maturationAge = maturationAge;
        this.adultWeight = adultWeight;
        this.currentAge = currentAge;
    }
    
    
    public void makeSound(){
        System.out.println("I am an Animal making sound");

    }
    public void eat(){
        System.out.println("I am eating");

    }

    public double getDevelopment(){
        double result = (this.currentAge/this.maturationAge);

        if(result >= 1){
            return 1;
        }
        else{
            return result;
        }
    }

    public boolean isAdult(){
        return this.currentAge >= this.maturationAge;
    }

    public double getCurrentWeight(){
        double age = getDevelopment();
        double result = age * this.adultWeight;
        return result;

    }
    
    @Override
    public String toString(){
        double weight = getCurrentWeight();
        String adult = " ";
        if(isAdult() == true){
            adult = "Yes";
        }
        else if (isAdult() == false){
            adult = "no";
        }
        return("the age is:" + this.currentAge + "the weight is:" + weight + "Adult:" + adult);

    }

}