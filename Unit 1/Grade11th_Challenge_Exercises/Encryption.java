
/**
* Name: Arshia Akbaripour
* Date:  15
* Description: Encryption (String/ASCII, loops)
*/

import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
    
        String userinput; // getting variables from user
        String Encrypted = "";
        Scanner in = new Scanner(System.in);

        // getting user input
        System.out.println("ENTER THE WORD YOU WANT");
        userinput = in.nextLine();
        in.close();

        // spliting userinput into words
        String[] word = userinput.split(" ");
        String[] last_word = new String[word.length];

        // looping each word
        for (int a = 0; a < word.length; a++) {
            last_word[a] = swapChars(word[a]); // replacing the first and last characters of first word

            // looping the rest of the word
            for (int b = 1; b < word[a].length() - 1; b++) {
                char[] wordCh = word[a].toCharArray();

                // converting to ASCII
                int ascii = (int) wordCh[b] + 2;
                char new_word = (char) ascii;

                // replacing our word with the new characters
                last_word[a] = last_word[a].replaceFirst(String.valueOf(wordCh[b]), String.valueOf(new_word));
            }

            // storing final word that user had given 
            if (a == 0) {
                Encrypted = last_word[a];
            } else {
                Encrypted = Encrypted + " " + last_word[a];
            }
        }
        System.out.printf("encrypted word -> %s \n", Encrypted);
    }

    /**
     * description : the shiftting of first and last character
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
