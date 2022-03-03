
/**
 * Name: Arshia
 * Date: March 1
 * Description: Cookie
 */
public class Cookie {

    /**
     * attributes
     */

    // name of the Cookie
    private String name;

    // Cookie amount of calories
    private int calories;

    // Cookie amount of weight
    private double weight;

    // is it Packaged or not
    private boolean isPackaged;

    // Default constructor for our attributes (Cookie)
    public Cookie() {
        this.name = "";
        this.weight = -1;
        this.calories = -1;
        this.isPackaged = false;

    }

    /**
     * Description: attributes of Cookie (4 attributes)
     * 
     * @param name     -> name of the Cookie
     * @param calories -> Amount of Calories of Cookie
     * @param weight   -> Amount of weight of Cookie
     */
    public Cookie(String name, double weight, int calories) {

        this.name = name;

        this.weight = weight;

        this.calories = calories;

        this.isPackaged = false;
    }

    /**
     * Description: attributes of Cookie (3 attributes)
     * 
     * @param name       -> name of the Cookie
     * @param calories   -> Amount of Calories of Cookie
     * @param weight     -> Amount of weight of Cookie
     * @param isPackaged -> Cookies being packed or not
     */
    public Cookie(String name, int calories, double weight, boolean isPackaged) {

        // we are declaring the attribute with the parameter

        this.name = name;

        this.weight = weight;

        this.calories = calories;

        this.isPackaged = isPackaged;
    }

    /**
     * Accessors
     */

    /**
     * gets the name of Cookie
     * 
     * @return the Cookie name
     */
    public String getname() {
        return this.name;
    }

    /**
     * gets the amount of calories
     * 
     * @return the calories
     */
    public double getCalories() {
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

    /**
     * gets if it is Packaged or not
     * 
     * @return the if it is Packaged
     */
    public boolean getisPackaged() {
        return this.isPackaged;
    }

    /*
     * Mutators
     */
    /**
     * the method will calculate the amount of calories being eaten
     * 
     * @param weight the amount of weight removed from cookies
     * @return -1 -> -1 meaning is that the cookies is not edible because weight is not more than weight of cookie
     * @return -2 -> -2 meaning is that this cookies is not edible because it is in package (can eat bag)
     * @return calories eaten
     */
    public int eaten(double newWeight) { // calculating the amount of calories being eaten by human

        if (newWeight > this.weight) {
            return -1;
        } else if (this.isPackaged) {
            return -2;
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
     * Description: Overrides the default string builder method and returns a string
     * with all attributes of the Cookie.
     * 
     * @return builder - a string that contains all the attributes of the Cookie
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
        builder += "isPackaged: ";
        builder += this.getisPackaged();
        builder += "\n";

        return builder;

    }

}
