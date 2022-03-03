
/** 
* Name: Arshia Akbaripour
* Date: Feb 9th
* Description: SASTriangleSolver (methods, math)
*/
import static java.lang.Math.sqrt;

import java.util.Scanner;

public class Akbaripour_Arshia_SASTriangleSolver {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // Declring variables
        double sideA;
        double sideB;
        double sideC;
        double angleC;
        double angleA;
        double angleB;
        double result;
        int alldegrees = 180;

        // Asking from user for both sides and the angle between
        System.out.println("Pleasr enter the first side (a)");
        sideA = in.nextDouble();
        in.nextLine();
        System.out.println("Pleasr enter the second side (b)");
        sideB = in.nextDouble();
        in.nextLine();
        System.out.println("Pleasr enter the angle in radians between first and second side (C)");
        angleC = in.nextDouble();
        in.nextLine();

        angleC = Math.toDegrees(angleC); // converting radians to degrees

        // c2 = a2 + b2 − 2ab cosC
        // calculating sidec
        sideC = sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2) - 2 * sideA * sideB * Math.cos(angleC));

        // a2 = c2 + b2 − 2cb cosA which can also be A = cos^-1(c2 + b2 - a2) / 2bc
        // calculating angleA
        angleA = Math.acos((Math.pow(sideC, 2) + Math.pow(sideB, 2) - Math.pow(sideA, 2)) / (2 * sideB * sideC));
        angleA = Math.toDegrees(angleA);

        angleB = alldegrees - (angleA + angleC); // calculating angleB by other angels using (A + B + C = 180) law

        result = Smallest_Angle(angleA, angleB, angleC);
        System.out.println(result);

    }

    /**
     * Description -> finding the smallest angle in tringle given by comparing angles with eachother
     * 
     * @param angleA -> angle that had been calculated based on sides
     * @param angleB -> angle that had been calculated based angles
     * @param angleC -> angle that had been calculated based on sides
     * @return -> smallest angle
     */
    public static double Smallest_Angle(double angleA, double angleB, double angleC) {
        double smallest;

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