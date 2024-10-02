public class Food {
    protected  boolean isVegetarian;
    protected int calories;

    public Food(boolean isVegetarian, int calories){
        this.calories = calories;
        this.isVegetarian = isVegetarian;
    }


    public boolean getVegetarian(){
        return this.isVegetarian;
    }
    
    public int getCalories(){
        return this.calories;
    }
}
