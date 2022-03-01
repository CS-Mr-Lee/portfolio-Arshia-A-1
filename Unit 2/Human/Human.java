
public class Human {

    /*
     * attributes
     */

    // sex of the human
    private String sex;

    // name of the human
    private String name;

    // energy of the human
    private double energy;

    // amount of weight
    private double weight;

    // measure of height
    private double height;

    public Human() {
    }

    /**
     * attributes of human
     * 
     * @param sex    -> sex of the human
     * @param name   -> name of the human
     * @param energy -> energy of the human
     * @param weight -> amount of weight
     * @param height -> measure of height
     */
    public Human(String sex, String name, double energy, double weight, double height) {
        this.sex = sex;
        this.name = name;

        if (energy > 0 && weight > 0 && height > 0) {
            this.energy = energy;
            this.weight = weight;
            this.height = height;
        } else {
            this.energy = 1;
            this.weight = 1;
            this.height = 1;
        }
    }

    /*
     * Accessors
     */

    /**
     * gets the type of human sex
     * 
     * @return the human name
     */
    public String getSex() {
        return this.sex;
    }

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
    public double getEnergy() {
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

    public double getHeight() {
        return this.height;
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
            this.weight = 1;
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
        double km = 0;
        while (km < kilometers) {
            this.setWeight(this.getWeight() - 0.001);
            this.setEnergy(this.getEnergy() * 0.05);
            km++;
        }

    }

    /**
     * Sets the energy level of the human
     * 
     * @param energy - the energy of the human
     */
    public void setEnergy(double energy) {
        this.energy = energy;
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
        builder += "Sex: ";
        builder += this.getSex();
        builder += "\n";
        builder += "Energy level: ";
        builder += this.getEnergy();
        builder += "\n";
        builder += "Weight: ";
        builder += this.getWeight();
        builder += "\n";
        builder += "Height: ";
        builder += this.getHeight();
        builder += "\n";

        return builder;

    }

}
