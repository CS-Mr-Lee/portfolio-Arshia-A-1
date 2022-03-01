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

    // amount of calories
    private int calories;

    // amount of weight
    private double weight;

    // is it isPackaged or not
    private boolean isPackaged;

    // Default constructor for our attributes
    public Cookie() {
        this.name = "";
        this.weight = -1;
        this.calories = -1;
        this.isPackaged = false;

    }

    public Cookie(String name, double weight, int calories) {

        this.name = name;
        this.weight = weight;
        this.calories = calories;
    }

    /**
     * Description: attributes of Cookie 
     * @param name -> name of the Cookie
     * @param calories -> Amount of Calories
     * @param weight -> Amount of weight
     * @param isPackaged -> Cookies being packed or not
     */
    public Cookie(String name, int calories, double weight, boolean isPackaged) {

        // we are declaring the attribute with the parameter

        this.name = name;

        this.weight = weight;

        this.calories = calories; // lmitting the amount of colories user can type in (between 0 to 200)
        if (calories < 0) {
            this.calories = 0;
        } else if (calories > 500) {
            this.calories = 500
            
            
            
            
            ;
        } else {
            this.calories = calories;
        }

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
    Mutators
    */
    public void Eaten (double newWeight) {

        if (weight==0 || weight == -1) {
             = -1;
        } else if () {
             = -2;
        } else {
            double Eatenweight = this.weight - weight;

        }
        
    }
    public void notPackaged () { 
        if (this.isPackaged) {
            this.isPackaged = false;
        }
    } 
    

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