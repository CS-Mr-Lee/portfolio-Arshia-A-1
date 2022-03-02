/**
 * Name: Arshia
 * Date: March 1
 * Description: Cookie
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
     * defult constructor 
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

        SleepingEnergy = (hours * (10 / 100));
        SleepingEnergy = energy;

    }

    /**
     * running will decreases weight and energy level
     * 
     * @param kilometers -> measurment of run
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
        this.energy = energy;
    }

    public void eat(Cookie food, double grams) {
        this.weight = this.weight + grams;

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
