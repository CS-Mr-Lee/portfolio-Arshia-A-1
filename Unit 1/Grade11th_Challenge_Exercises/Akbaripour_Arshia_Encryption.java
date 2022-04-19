
/**
* Name: Arshia Akbaripour
* Date:  Feb.15
* Description: Encryption (String/ASCII, loops)
*/

import java.util.Scanner;

public class Akbaripour_Arshia_Encryption {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String userinput;
        String encrypted;

        System.out.println("Enter Your Word "); // getting user input
        userinput = in.nextLine();
        in.close();

        // Dividng them into several words by space
        String[] userinputSplit = userinput.split(" ");

        // for loop for first word of splitted word and saving them into string arrays
        for (int i = 0; i < userinputSplit.length; i++) {

            // get the first element and last element of new words
            char firstElementEncrypted = userinputSplit[i].charAt(userinputSplit[i].length() - 1);
            char lastElementEncrypted = userinputSplit[i].charAt(0);

            // putting first element to new string or our new encrypted word
            encrypted = firstElementEncrypted + "";
            
            char newChar; // declaring new variable for conerting to ASCII

            // for loop for second word of splitted word and saving them into string arrays
            for (int j = 1; j < userinputSplit[i].length() - 1; j++) {

                // adding 2 to each middle elements ASCII and get the new elements
                newChar = (char) (userinputSplit[i].charAt(j) + 2);

                // adding new elements to String
                encrypted = encrypted + newChar;
            }
            // adding the last encrypted element to the new String
            encrypted = encrypted + lastElementEncrypted;

            // replacing original word in the array with new encrypted string
            userinputSplit[i] = encrypted;
        }

        // printing the encrypted word
        for (String i : userinputSplit) {
            System.out.println(i + "");
        }
    }
}