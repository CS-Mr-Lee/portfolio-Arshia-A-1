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

    // amount of calories of vegetable
    private int calories;

    // amount of weight of vegetable
    private double weight;

    public Vegetable() { // defult constructor
        this.name = "";
        this.weight = -1;
        this.calories = -1;
    }

    /**
     * discription : attributes of Vegetables
     * 
     * @param name     -> name of the vegetable
     * @param weight   -> amount of weight of vegetable
     * @param calories -> amount of calories of vegetable
     */
    public Vegetable(String name, double weight, int calories) {

        // we are declaring the attribute with the parameter

        this.name = name;

        this.weight = weight;

        this.calories = calories; // lmitting the amount of colories user can type in (0 to 300)
        if (calories < 0) {
            this.calories = 0;
        } else if (calories > 300) {
            this.calories = 300;
        } else {
            this.calories = calories;
        }
    }

    /**
     * Accessors
     */

    /**
     * gets the type of vegetable name
     * 
     * @return the vegetable name
     */
    public String getname() {
        return this.name;
    }

    /**
     * gets the amount of calories (vegetable)
     * 
     * @return the calories
     */
    public int getCalories() {
        return this.calories;
    }

    /**
     * gets the amount of weight (vegetable)
     * 
     * @return the weight
     */
    public double getweight() {
        return this.weight;
    }

    /*
     * Mutators
     */
    public int eaten (double newWeight) { // calculating the amount of calories being eaten by human

        if (newWeight > this.weight) { 
            return -1;
        } else {
            double eatenweight = this.weight - newWeight;

            double percentagetemp = this.weight / newWeight;
            double percentage = percentagetemp / 100;
            double tempCalories = this.calories * percentage;
            double newCalories = tempCalories / 10;

            return (int) newCalories;
        }
        
    }

    /**
     * changes the weight of the meat cannot be less than 0 or greater than original
     * weight
     * 
     * @param newWeight newWeight expected new weight
     */
    public void setWeight(double newWeight) {
        // make it not bigger than original, must be > 0

        if (newWeight > this.weight) {
            this.weight = this.weight; // if newweight is more than original weight, it does not change the original weight
                             
        } else if (newWeight < 0) { // restriction from negative weight
            this.weight = 0;
        } else if (newWeight == 0) {
            this.weight = 0;
        } else { // all other cases
            this.weight = newWeight;
        }
    }

    /**
     * changes the Calories of the vegetable; cannot be less than 0 or greater than
     * original Calories
     * 
     * @param newCalories newCalories
     */
    public void setCalories(int newCalories) { // if newCalories is more than original calories, it does not
        if (newCalories > this.calories) { // change the original calories
            this.calories = this.calories;
        } else if (newCalories < 0) {
            this.calories = 0;
        } else if (newCalories == 0) {
            this.calories = 0;
        } else if (newCalories > 200) {
            this.calories = 200;
        } else { // all other cases
            this.calories = newCalories;
        }

    }

    /**
     * Description: Overrides the default string builder method and returns a string
     * with all attributes of the vegetable.
     * 
     * @return builder - a string that contains all the attributes of the vegetable
     */
    @Override
    public String toString() {
        String builder = "";

        builder += "Name: ";
        builder += this.getname();
        builder += "\n";
        builder += "weight: ";
        builder += this.getweight();
        builder += "\n";
        builder += "Calories: ";
        builder += this.getCalories();
        builder += "\n";

        return builder;

    }

}