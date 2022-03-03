
/**
* Name: Arshia Akbaripour
* Date: Feb 12 and 13
* Description: FoolProof (Conditionals)
*/

import java.util.*;

public class Akbaripour_Arshia_FoolProof {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String Firstnumbertemp = ""; // its for if user wants to exit from calculator so we storing it as string and after that converting in double
        int Firstnumber = 0;
        int Secondnumber = 0;
        int userchoice = 0;
        int ex; // declaring variables

        do {
            System.out.println("Enter your choice from the following menu:");
            System.out.println("1.Adding  2.Subtracting  3.Multiplying  4.Dividing 5. Quit"); // asking user to choose any operations

            try {
                userchoice = in.nextInt();
                in.nextLine();
            } catch (InputMismatchException e) {
            } // catching the error if they enter word instead of number

            if (userchoice != 5) { // if they didnt choose 5 which is exit, it will ask for number one and two for prefered operations 
                try {
                    System.out.println("Enter the first number");
                    Firstnumbertemp = in.nextLine();
                    if (Firstnumbertemp.charAt(0) == 'q' || Firstnumbertemp.charAt(0) == 'Q') { // first we are checking the first number as string
                        System.out.println("You exited the calcualtor"); // if its q r Q, it will bring user to line 65
                        userchoice = 5;
                    }

                    Firstnumber = (int) Double.parseDouble(Firstnumbertemp); // converting first number from string to number

                    System.out.println("Enter the second number");
                    Secondnumber = in.nextInt();
                    in.nextLine();
                } catch (NumberFormatException e) {
                } // catching the error if string is in bad form
            }
            switch (userchoice) {

                case 1:
                    System.out.println("Addition of " + Firstnumber + " and " + Secondnumber + " is " + (Firstnumber + Secondnumber));
                    // formula for Addition operation

                    break;
                case 2:
                    System.out.println("Subtraction of " + Firstnumber + " and " + Secondnumber + " is " + (Firstnumber - Secondnumber));
                    // formula for Subtraction operation

                    break;
                case 3:
                    System.out
                            .println("Multiplication of " + Firstnumber + " and " + Secondnumber + " is " + (Firstnumber * Secondnumber));
                    // formula for Multiplication operation

                    break;
                case 4:
                    if (Secondnumber == 0) // if number 2 is equal too zero, we cant do the operation
                        System.out.println("You can't divide" + Firstnumber + "by" + Secondnumber);
                    else {
                        System.out
                                .println("In division of " + Firstnumber + " by " + Secondnumber + " is " + (Firstnumber / Secondnumber));
                                          // formula for Divide operation
                    }
                    break;
                case 5:
                    break;
                // if they choose more than 5 as a choice for choosing operations, it will say that its invalid choice
                default:
                    System.out.println("poor data. please choose between 1 to 5");
            }

            System.out.println("Do you wish to continue? 1. Yes 2. No"); // asking the user if they want to continue
            ex = in.nextInt();
            in.nextLine();
        } while (ex == 1); // if yes whcih is 1, it will repeat the loop again
    }                      // if no whcih is 2, it will nclose the calculator
}
