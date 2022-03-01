/**
* Name: Arshia Akbaripour
* Date: Feb 22
* Description: Vegetable 
*/
public class Vegetable {

    /* 
    * attributes
    */

    // name of the vegetable
    private String name;

    // amount of calories
    private int calories;

    // amount of weight
    private double weight;

    public Vegetable () {
        this.name = "";
        this.weight = -1;
        this.calories = -1;
    }

    /**
     * discription : attributes of Vegetables
     * 
     * @param name     -> name of the vegetable
     * @param weight   -> amount of weight
     * @param calories -> amount of calories
     */
    public Vegetable(String name, double weight, int calories) {

        // we are declaring the attribute with the parameter

        this.name = name;

        this.weight = weight;

        this.calories = calories; // lmitting the amount of colories user can type in
        if (calories < 0) {
            this.calories = 0;
        } else if (calories > 200) {
            this.calories = 200;
        } else {
            this.calories = calories;
        }
    }

    /**
    Accessors
    */

    /**
     * gets the type of organ name
     * 
     * @return the organ name
     */
    public String getname() {
        return this.name;
    }

    /**
     * gets the amount of calories
     * 
     * @return the calories
     */
    public int getCalories() {
        return this.calories;
    }

    /**
     * gets the amount of weight
     * 
     * @return the weight
     */
    public double getweight() {
        return this.weight;
    }

    /*
    Mutators
    */
    /**
     * changes the weight od the meat cannot be less than 0 or greater than original weight
     * @param newWeight newWeight expected new weight
     */
    public void setWeight (double newWeight) {
        // make it not bigger than original, must be > 0

        if (newWeight > this.weight) {
            this.weight = this.weight; // if newweight is more than original weight, it does not change the original weight
        } else if (newWeight < 0) {    // restriction from negative weight
            this.weight = 0;
        } else if (newWeight == 0) {
            this.weight = 0;
        } else {                       // all other cases
            this.weight = newWeight;
        }
    }
    
    /**
     * changes the Calories of the vegetable; cannot be less than 0 or greater than original Calories
     * @param newCalories newCalories 
     */
    public void setCalories (int newCalories) { // if newCalories is more than original calories, it does not 
        if (newCalories > this.calories) {         // change the original calories
            this.calories = this.calories; 
        } else if (newCalories < 0) { 
            this.calories = 0;
        } else if (newCalories == 0) {
            this.calories = 0;
        } else if (newCalories > 200) {
            this.calories = 200;
        } else {                    // all other cases
            this.calories = newCalories;
        }
    }  
       
}