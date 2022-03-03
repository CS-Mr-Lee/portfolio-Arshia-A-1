/**
 * Name: Arshia
 * Date: March 1
 * Description: Quiz
 */
public class Akbaripour_Arshia_OOQuiz1 {
  public static void main(String[] args) {

    Human humanWhatever = new Human("MasonLo", 50, 50);
    Vegetable vegetableWhatever = new Vegetable("broccoli", 50, 200);

    Cookie SecondCookie = new Cookie("Zabon", 30, 150);
    Cookie ThirdCookie = new Cookie("Bamiye", 20, 200, true);
    Cookie FirstCookie = new Cookie();

    // human eathing the bagged cookies
    humanWhatever.eat(ThirdCookie, 20);

    // human eating cookie and getting energy from it
    humanWhatever.eat(SecondCookie, 10);

    // human eating alot of vegetables
    humanWhatever.eat(vegetableWhatever, 50);

    System.out.printf("First human energy: %d percent\n", humanWhatever.getEnergy()); // First human energy

    System.out.printf("Human energy right now: %d percent", humanWhatever.getEnergy()); // Human energy right now

  }
}