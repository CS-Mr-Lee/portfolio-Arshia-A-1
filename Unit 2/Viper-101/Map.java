/**
 * Course: ICS4U1
 * Date: Apr. 29th, 2022
 * @author Arshia Akbaripour
* Date: May 2, 2022
* Description:game mode class which yyou can choose either battle royal or arena mode to play.
*/

public class Map {
    /*
    Attributes
    */
    private String weather;
    private String location;
    private double size;
    private int temp;
    private String name;

    /*
    Constructor
    */
    public Map(String name, String weather, String location, double size, int temp) {
        this.name       = name;
        this.weather    = weather;
        this.location   = location;
        this.size       = size;
        this.temp       = temp;
    }

    /*
    Accessors
    */
    public String getWeather() {return this.weather;}
    public String getLocation() {return this.location;}
    public double getSize() {return this.size;}
    public int getTemp() {return this.temp;}
    public String getName() {return this.name;}
    public void setTemp(int temp) {this.temp = temp; } 

    /*
    Methods
     */
    public void tempHealthDecrease (Charecters charecter) { 
        if (this.temp <= 60) { 
            this.setTemp (charecter.getHealth() - 20);
            System.out.println("ITS SO HOT OUT HERE");
            System.out.printf("Your charecter lost HP because of hot weather %d \n", charecter.getHealth());

        } 
    }

    public String toString() {
        String builder = "";

        builder += "Name : " + this.name + ", ";
        builder += "Weather : " + this.weather + ", ";
        builder += "Location : " + this.location + ", ";
        builder += "Size : " + this.size + ", ";
        builder += "Temp : " + this.temp + ", ";

        return builder;
    }
}