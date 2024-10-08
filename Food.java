public class Food {
    protected  boolean isVegetarian;
    protected int calories;
    protected  int currentAge;

    public Food(boolean isVegetarian, int calories, int currentAge){
        this.calories = calories;
        this.isVegetarian = isVegetarian;
        this.currentAge = currentAge;
    }


    public boolean getVegetarian(){
        return this.isVegetarian;
    }
    
    public int getCalories(){
        return this.calories;
    }
    public int getAge(){
        int age = this.currentAge;
        return age;
    }

    public int age(double numYears){
        int age = 0;
        age += this.currentAge; 
        return age;
    }

public boolean foodGoneBad(){
        return this.currentAge < 0.1;
}
}
