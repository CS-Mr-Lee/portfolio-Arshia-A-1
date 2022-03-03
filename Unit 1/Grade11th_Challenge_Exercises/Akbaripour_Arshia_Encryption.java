
/**
* Name: Arshia Akbaripour
* Date:  15
* Description: Encryption (String/ASCII, loops)
*/

import java.util.Scanner;

public class Akbaripour_Arshia_Encryption {
    public static void main(String[] args) {

        String userinput; // getting variables from user
        String Encrypted = "";
        Scanner in = new Scanner(System.in);

        System.out.println("ENTER THE WORD YOU WANT"); // getting user input
        userinput = in.nextLine();
        in.close();

        String[] word = userinput.split(""); // spliting userinput into words
        String[] last_word = new String[word.length];

        for (int a = 0; a < word.length; a++) { // looping each word
            last_word[a] = swapChars(word[a]); // replacing the first and last characters of first word

            for (int b = 1; b < word[a].length() - 1; b++) { // looping the rest of the word
                char[] wordCh = word[a].toCharArray();

                int ascii = (int) wordCh[b] + 2; // converting to ASCII
                char new_word = (char) ascii;

                last_word[a] = last_word[a].replaceFirst(String.valueOf(wordCh[b]), String.valueOf(new_word));                                                                                                               // our
                // replacing word with the new characters

            }

            if (a == 0) { // storing final word that user had given
                Encrypted = last_word[a];
            } else {
                Encrypted = Encrypted + " " + last_word[a];
            }
        }
        System.out.printf("encrypted word -> %s \n", Encrypted);
    }

    /**
     * description : the shiftting of first and last character
     * 
     * @param word
     * @return String (new word that had been converted to ASCII)
     */
    public static String swapChars(String word) {
        // Converting the string into array
        char[] characterWord = word.toCharArray();
        char temporary = characterWord[0];

        characterWord[0] = characterWord[characterWord.length - 1];
        characterWord[characterWord.length - 1] = temporary;

        return String.valueOf(characterWord);
    }

}
