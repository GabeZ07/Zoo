


public abstract class Animal {
    protected int maturationAge;
    protected double adultWeight;
    protected int currentAge;
    protected int caloreisNeeded;
    protected int caloriesConsumed;

    public Animal(int maturationAge, double adultWeight, int currentAge, int caloreisNeeded, int caloriesConsumed){
        this.maturationAge = maturationAge;
        this.adultWeight = adultWeight;
        this.currentAge = currentAge;
        this.caloreisNeeded = caloreisNeeded;
        this.caloriesConsumed = caloriesConsumed;
    }
    
    
    public abstract String makeSound();

    public abstract void eat(Food food);

    public double getDevelopment(){
        double result = (this.currentAge/this.maturationAge);

        if(result >= 1){
            return 1;
        }
        else{
            return result;
        }
    }

    public int getCaloriesNeeded(){
        return (this.caloreisNeeded - this.caloriesConsumed);
    }

    public int getCaloriesConsumed(){
        return this.caloriesConsumed;
    }

    public void sleepAndWakeUp(){
        this.caloriesConsumed = 0;
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