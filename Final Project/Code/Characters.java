/**
 * Course: ICS4U1
 * Date: 
 * @author Arshia Akbaripour
 * 
 */

public class Characters extends Player {
    /*
    Attributes
    */
    private String name; // character name
    private String sex; // character sex

    /**
     * Discription : Attributes of character
     * @param name -> name of the character
     * @param sex -> sex of character
     */
    public Characters (String name, String sex) {

        this.name   = name;
        this.sex    = sex;

    }

    /*
    Accessors
    */

    public String getName() {return this.name;} // gets name of character
    public String getSex() {return this.sex;} // // gets sex of character

    /**
     * Overrides the default string builder method and
     * returns a string with all attributes of the character.
     * 
     * @return builder - a string that contains all
     *         . the attributes of the character
     */
    public String toString() {
        String builder = "";

        builder += "Name : " + this.name + ", ";
        builder += "Sex : " + this.sex + ", ";

        return builder;
    }
    
}