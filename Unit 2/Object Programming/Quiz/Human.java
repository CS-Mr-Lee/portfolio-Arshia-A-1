/**
 * Name: Arshia
 * Date: March 1
 * Description: Human
 */
public class Human {

    /*
     * attributes
     */

    // name of the human
    private String name;

    // energy of the human
    private int energy;

    // amount of weight
    private double weight;

    /**
     * Default constructor for our attributes (Human)
     */
    public Human() {
        this.name = "";
        this.energy = -1;
        this.weight = -1;
    }

    /**
     * attributes of human
     * 
     * @param name   -> name of the human
     * @param energy -> energy of the human
     * @param weight -> amount of weight
     */
    public Human(String name, int energy, double weight) {
        this.name = name;
        this.energy = energy;
        this.weight = weight;

    }

    /*
     * Accessors
     */

    /**
     * Gets the human's name
     * 
     * @return the name of the human
     */
    public String getName() {
        return this.name;
    }

    /**
     * gets the amount of Energy
     * 
     * @return the Energy
     */
    public int getEnergy() {
        return this.energy;
    }

    /**
     * gets the amount of weight
     * 
     * @return the weight
     */
    public double getWeight() {
        return this.weight;
    }

    /*
     * Mutators
     */

    /**
     * Weight cannot be less than 0, so if
     * the weight passed is less than 0, then
     * weight is set to 1.
     * 
     * @param weight -> the weight of the human
     */
    public void setWeight(double weight) {
        if (weight < 0) {
            this.weight = 50;
        } else {
            this.weight = weight;
        }
    }

    /**
     * sleeping will raise your energy
     * raises energy level by hours * 10%
     * 
     * @param hours -> hours of sleep
     */
    public void sleep(double hours) {
        double SleepingEnergy;

        SleepingEnergy = (int)(hours * 10); // casting int to convert doubel to string 
        SleepingEnergy = energy;

    }

    /**
     * running will decreases weight and energy level
     * 
     * @param kilometers -> measurment of how many kilometers human run
     */
    public void run(double kilometers) {

        this.setEnergy((int) (this.getEnergy() * 3));

        this.setWeight(this.getWeight() - 0.001 * kilometers);

    }

    /**
     * Sets the energy level of the human
     * 
     * @param energy - the energy of the human
     */
    public void setEnergy(int energy) {

        if (100 > energy) {
            this.energy = 100;
        } else if (0 < energy) {
            this.energy = 0;
        } else { // energy must be between 0 to 100
            this.energy = energy;
        }
    }

    /**
     * calculate amount of new weight and new calories (Cookie)
     * @param food  Cookie object
     * @param grams amount of cookie that human ate
     */
    public void eat(Cookie food, double grams) {

        // if it is packed then the human cant eat the bag
        if (food.getisPackaged()) {
            System.out.println("I cant eat the bag");

        } else if (food.getweight() < grams) { // if the amount of food the want to eat it greater; its not true because there is not that much food
            System.out.println("Not enough food");

        } else { 
            this.weight = this.weight + grams; // getting fat (weight)

            // calculating the amount of enrgy human is taking from eating (Cookie)
            this.energy = this.energy + (int)((grams / food.getweight()) * food.getCalories());
            this.energy = this.energy / 15;

            setEnergy(this.energy);
        }
    }

    /**
     * calculate amount of new weight and new calories (Vegetable)
     * @param grams amount of Vegetable that human ate
     * @param vegi Vegetable object
     */
    public void eat(Vegetable vegi, double grams) {

        //
        if (vegi.getweight() < grams) { // if the amount of food the want to eat it greater; its not true because there is not that much food
            System.out.println("Not enough food");

        } else { 
            this.weight = this.weight + grams; // getting fat (weight)

            // calculating the amount of enrgy human is taking from eating (Vegetable)
            this.energy = this.energy + (int)((grams / vegi.getweight()) * vegi.getCalories());
            this.energy = this.energy / 15;

            setEnergy(this.energy);
        }
    }

    /**
     * Overrides the default string builder method and
     * returns a string with all attributes of the human.
     * 
     * @return builder - a string that contains all
     *         . the attributes of the human
     */
    @Override
    public String toString() {
        String builder = "";

        builder += "Name: ";
        builder += this.getName();
        builder += "\n";
        builder += "Energy level: ";
        builder += this.getEnergy();
        builder += "\n";
        builder += "Weight: ";
        builder += this.getWeight();
        builder += "\n";

        return builder;

    }

}
