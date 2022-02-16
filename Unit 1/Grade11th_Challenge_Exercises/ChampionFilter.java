
/**
* Name: Arshia Akbaripour
* Date: Feb 14 and 15
* Description: ChampionFilter (File I/O, Conditionals, String)
*/
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class ChampionFilter {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    double highestHp = -1;         // declaring hp and armor, the reason why we declared hp -1 and armor 10000000 is because it must be
    double lowestArmor = 10000000;//  greater than that number so it will replace with any value in the Champion.json

    // declaring all name Empty because we have to initial it if we want to print it out
    String nameLegend = "Empty";
    String Armor = "Empty";
    String Hp = "Empty";
    String lineIntel;

    try {
      FileReader fileReader = new FileReader("champions.json");
      BufferedReader output = new BufferedReader(fileReader);

      // using loop to understand if we read all the lines inside the Champion.json file
      while ((lineIntel = output.readLine()) != null) {

        String[] stringSplit = lineIntel.split("\""); // spliting line with quotation

        if (stringSplit.length > 2) { // use length greater than two for not causing an error

          if (stringSplit[1].equalsIgnoreCase("name")) { // if there is a name, put it in the name so we can show it later
            nameLegend = stringSplit[3];
          }

          if (stringSplit[1].equalsIgnoreCase("hp")) { // if there is a hp line, split it and get the value double
            String temporaryString[] = stringSplit[2].split(":");
            String temporaryString2[] = temporaryString[1].split(",");

            if (Double.parseDouble(temporaryString2[0]) > highestHp) { // comparing current hp that we have with highest hp that had been saved
              highestHp = Double.parseDouble(temporaryString2[0]);
              Hp = nameLegend;
            }
          }

          if (stringSplit[1].equalsIgnoreCase("armor")) { // same thing as ho but this time with armor
            String temporaryString[] = stringSplit[2].split(":");
            String temporaryString2[] = temporaryString[1].split(",");

            if (Double.parseDouble(temporaryString2[0]) < lowestArmor) { // comparing with the lowest armorm that had been saved
              lowestArmor = Double.parseDouble(temporaryString2[0]);
              Armor = nameLegend;
            }
          }
        }
      }

      fileReader.close();
      output.close();
    } catch (IOException e) {
      System.out.println("Cannot read the file");
    }
    // writting into MaxChampStats.txt file the result we want
    try {
      File file = new File("MaxChampStats.txt");
      FileWriter fileWriter = new FileWriter(file);
      BufferedWriter output = new BufferedWriter(fileWriter);

      output.write(Armor + " " + lowestArmor);
      output.newLine();
      output.write(Hp + " " + highestHp);
      output.newLine();

      output.close();
      fileWriter.close();
    }

    catch (IOException e) {
      System.out.println("Cannot read from file.");
    }

  }
}