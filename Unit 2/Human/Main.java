
/**
 * Name: Arshia and Mike
 * Date: Feb 25
 * Description:
 * This is the main program that tests out the Human class by creating two humans with specific attributes and testing out the different methods within the Human class on the two objects.
 */
public class Main {
    public static void main(String[] args) {

        Human johnDoe = new Human("Male", "John Doe", 45, 60, 180);

        Human maisonLo = new Human("Male", "Maison Lo", 60, 80, 175);

        /*
         * Test out the accessor and
         * mutator methods for the human *John Doe*
         */

        System.out.println(johnDoe.getName()); // Get their name and print it out
        System.out.println(johnDoe.getSex()); // Get their sex and print it out
        System.out.println(johnDoe.getWeight()); // Get their weight and print it out
        System.out.println(johnDoe.getEnergy()); // Get their energy and print it out
        System.out.println(johnDoe.getHeight()); // Get their height and print it out

        // Using the setWeight() mutator method to change his weight
        double johnDoeNewWeight = 55;
        johnDoe.setWeight(johnDoeNewWeight);
        System.out.println(johnDoe.getWeight()); // Should print out new weight

        // Using the setEnergy() mutator method to change his energy level
        double johnDoeTiredEnergy = 14;
        johnDoe.setEnergy(johnDoeTiredEnergy);
        System.out.println(johnDoe.getEnergy()); // Should print out new energy level

        johnDoe.run(20); // Loses energy and weight
        System.out.println(johnDoe.getWeight()); // Should be less weight than before
        System.out.println(johnDoe.getEnergy()); // Should be different from johnDoe's previous energy level

        johnDoe.sleep(10); // Sleep 10 hours to recover his energy
        System.out.println(johnDoe.getEnergy()); // Should be different from johnDoe's previous energy level

        /*
         * Test out the accessor and
         * mutator methods for the human *Maison Lo*
         */

        // Get their name and print it out
        System.out.println(maisonLo.getName());

        // Get their sex and print it out
        System.out.println(maisonLo.getSex());

        // Get their energy and print it out
        System.out.println(maisonLo.getEnergy());

        // Get their weight and print it out
        System.out.println(maisonLo.getWeight());

        // Get their height and print it out
        System.out.println(maisonLo.getHeight());

        // Using the setWeight() mutator method to change his weight
        double maisonLoNewWeight = 75;
        maisonLo.setWeight(maisonLoNewWeight);
        System.out.println(maisonLo.getWeight());

        // Using the setEnergy() mutator method to change his energy level
        double maisonLoTiredEnergy = 12;
        maisonLo.setEnergy(maisonLoTiredEnergy);
        System.out.println(maisonLo.getEnergy());

        maisonLo.run(15); // Loses energy and weight
        System.out.println(maisonLo.getWeight());
        System.out.println(maisonLo.getEnergy());

        maisonLo.sleep(6); // Sleep 10 hours to recover his energy
        System.out.println(maisonLo.getEnergy());

        /*
         * Test out the toString() method for both humans
         */

        System.out.println(johnDoe.toString());
        System.out.println(maisonLo.toString());

    }
}