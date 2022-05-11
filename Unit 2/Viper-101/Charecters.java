/**
 * Course: ICS4U1
 * Date: Apr. 28th, 2022
 * @author Arshia Akbaripour
 */

import java.util.concurrent.TimeUnit;

public class Charecters {
    /*
    Attributes
    */
    private int health; // charecter health
    private String name; // charecter name
    private String skill; // charecter skill
    private String sex; // charecter sex
    private int armor; // charecter armor
    private String quote; // charecter quote

    /*
    Constructor
    */
    /**
     * Discription : Attributes of charecter
     * @param health -> amount of charecter health
     * @param name -> name of the charecter
     * @param skill -> skill name of charecter
     * @param sex -> sex of charecter
     * @param armor -> amont of charecter armor
     * @param quote -> quote of charecter
     */
    public Charecters(int health, String name, String skill, String sex, int armor, String quote) {

        this.health = health; 
        this.name   = name;
        this.skill  = skill;
        this.sex    = sex;
        this.armor  = armor;
        this.quote  = quote;
    }

    /*
    Accessors
    */
    public int getHealth() {return this.health;} // gets the amount of health
    public String getName() {return this.name;} // gets name of charecter
    public String getSkill() {return this.skill;} // gets skill name of charecter
    public String getSex() {return this.sex;} // // gets sex of charecter
    public int getArmor() {return this.armor;} // gets the amount of armor
    public String getQuote() {return this.quote;} // gets the quote of charecter

    public void setArmor(int armor) { // if armor is equal or below zero, it will be set to zero.
        if (armor <= 0) {
            this.armor = 0;
        } else {
            this.armor = armor;
        }
    }
    public void setHealth(int health) { // if health is equal or below zero, it will be set to zero.
        if (health <= 0) {
            this.health = 0;
        } else {
            this.health = health;
        }
    }

    /*
    Methods
    */
    public void heal () { // if the health is less than 100, your charecter will heal up by 20 
        if (this.health < 100 && this.health + 20 <= 100) { // if health is less than 100 and adding up 20 to health is equal or less than 100, user can heal up
            setHealth(this.health + 20);
            System.out.println("Wait a second! im healing");
            System.out.printf("your health is restored to %d \n \n", this.health);
        } else {
            System.out.println("Health is full!");
        }
    } 
    
    public void armorUp () { // if the armor is less than 50 , your charecter will armor up by 10
        if (this.armor < 50 && this.armor + 10 <= 50) {  // if armor is less than 50 and adding up 10 to armor is equal or less than 50, user can armor up
            setArmor(this.armor + 10);
            System.out.println("im shot! cover me im armoring up");
            System.out.printf("your armor is restored to %d \n \n", this.armor);
        } else {
            System.out.println("Armour already full!");
        }
    } 

    public void useSkill () { // when ever charecter uses the skill, the special quote will play
        // audio file
        String filePath = "../Quotes/" + this.name + ".wav";

        // typing the characters' quote
        System.out.printf("your Charecters used %s \n \n", this.skill);
        System.out.println(this.quote);

        // playing the characters' quote
        new PlayQuote(filePath);
    }

    public void move () { // if the user wish to move the charecter, it prints two strings delayed by 2 seconds from each other
        try {
            System.out.println("You moved ..");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("noice ! \n");
        } catch (Exception e) {
            System.out.println("bruh really ?");
        }
    }

    /**
     * Overrides the default string builder method and
     * returns a string with all attributes of the charecter.
     * 
     * @return builder - a string that contains all
     *         . the attributes of the charecter
     */
    public String toString() {
        String builder = "";

        builder += "Health : " + this.health + ", ";
        builder += "Name : " + this.name + ", ";
        builder += "Skill : " + this.skill + ", ";
        builder += "Sex : " + this.sex + ", ";
        builder += "Armor : " + this.armor + ", ";
        builder += "Quote : " + this.quote;

        return builder;
    }
    
}