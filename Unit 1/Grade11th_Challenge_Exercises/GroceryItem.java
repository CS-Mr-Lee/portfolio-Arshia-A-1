
/** 
* Name: Arshia Akbaripour
* Date: Feb 8th
* Description: GroceryItem (formatted output,input)
*/
import java.util.Scanner;

public class GroceryItem {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    // Declaring variables
    double priceitem1;
    double priceitem2;
    String nameitem1;
    String nameitem2;
    int itemNum1;
    int itemNum2;
    double Totalprice;

    System.out.println("Enter the items you want to buy and their prices");
    // Asking from user to enter the product and their prices and the amount they
    // are buying for stroing the values
    System.out.println("please enter the name of the first product");
    nameitem1 = in.nextLine();
    System.out.println("how many you are buying");
    itemNum1 = in.nextInt();
    System.out.println("please enter the price of your first item");
    priceitem1 = in.nextDouble();
    in.nextLine();

    System.out.println("please enter the name of the second product");
    nameitem2 = in.nextLine();
    System.out.println("how many you are buying");
    itemNum2 = in.nextInt();
    System.out.println("please enter the price of your second item");
    priceitem2 = in.nextDouble();
    in.nextLine();

    // multiplying the amount of each product with their prices to get total price
    Totalprice = (priceitem1 * itemNum1) + (priceitem2 * itemNum2);

    // Showing the prices for each product and total price
    System.out.println("Here is your reciept");
    System.out.println("Name           |  #  |   Price");
    System.out.println("[------------------------------]");
    System.out.printf("%-15s|%5d|$%7.2f%n", nameitem1, itemNum1, priceitem1);
    System.out.printf("%-15s|%5d|$%7.2f%n", nameitem2, itemNum2, priceitem2);
    System.out.printf("Your total price is: $%.2f%n%n", Totalprice);
    System.out.println("[------------------------------]");

  }
}