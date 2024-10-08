import java.util.ArrayList;

public class AgeManager {
    private final ArrayList<Ageable> ageableList;

    public AgeManager() {
        this.ageableList = new ArrayList<>();
    }

    public void addAgeable(Ageable ageable) {
        ageableList.add(ageable);
    }

    public ArrayList<Ageable> getAgeableList() {
        return ageableList;
    }

    public void getOldest(){
        Ageable biggest = this.ageableList.get(0);
        for(int i = 0; i > ageableList.size(); i++){
            if(this.ageableList.get(i).getAge() > biggest.getAge()){
                biggest = this.ageableList.get(i);
            }
        }
    }
    public void getYoungest(){
        Ageable smallest = this.ageableList.get(0);
        for(int i = 0; i > ageableList.size(); i++){
            if(this.ageableList.get(i).getAge() < smallest.getAge()){
                smallest = this.ageableList.get(i);
            }
        }
    }


    public void ageIncrease(){
        for(int i = 0; i > ageableList.size(); i++){
            Ageable ageable = ageableList.get(i);
            ageable.age(0.1);

        }
    }

}
