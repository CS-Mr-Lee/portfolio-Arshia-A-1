
/** 
* Name: Arshia Akbaripour
* Date: Feb 9th
* Description: SASTriangleSolver (methods, math)
*/
import static java.lang.Math.sqrt;

import java.util.Scanner;

public class SASTriangleSolver {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // Declring variables
        double sidea;
        double sideb;
        double sidec;
        double angleC;
        double angleA;
        double angleB;
        double result;
        int alldegrees = 180;

        // Asking from user for both sides and the angle between
        System.out.println("Pleasr enter the first side (a)");
        sidea = in.nextDouble();
        in.nextLine();
        System.out.println("Pleasr enter the second side (b)");
        sideb = in.nextDouble();
        in.nextLine();
        System.out.println("Pleasr enter the angle in radians between first and second side (C)");
        angleC = in.nextDouble();
        in.nextLine();

        angleC = Math.toDegrees(angleC); // converting radians to degrees

        // c2 = a2 + b2 − 2ab cosC
        // calculating sidec
        sidec = sqrt(Math.pow(sidea, 2) + Math.pow(sideb, 2) - 2 * sidea * sideb * Math.cos(angleC));

        // a2 = c2 + b2 − 2cb cosA which can also be A = cos^-1(c2 + b2 - a2) / 2bc
        // calculating angleA
        angleA = Math.acos((Math.pow(sidec, 2) + Math.pow(sideb, 2) - Math.pow(sidea, 2)) / (2 * sideb * sidec));
        angleA = Math.toDegrees(angleA);

        angleB = alldegrees - (angleA + angleC); // calculating angleB by other angels using (A + B + C = 180) law

        result = returning_smallest(angleA, angleB, angleC);
        System.out.println(result);

    }

    /**
     * Description -> finding the smallest angle in tringle given by comparing
     * angles with eachother
     * 
     * @param angleA -> angle that had been calculated based on sides
     * @param angleB -> angle that had been calculated based angles
     * @param angleC -> angle that had been calculated based on sides
     * @return -> smallest angle
     */
    public static double returning_smallest(double angleA, double angleB, double angleC) {
        Double smallest;

        if (angleA <= angleB && angleA <= angleC) {
            smallest = angleA;
        } else if (angleB <= angleC && angleB <= angleA) {
            smallest = angleB;
        } else {
            smallest = angleC;
        }

        return smallest;

    }

}