package javabasics._10;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4Bonus();
    }

    /**
     * AND = &&
     * OR = ||
     * XOR = ^
     */

    /**
     * 1: Using an if statement, print: "Comfortable clothes" if the following conditions are met:
     *
     *    isWarm is true and wearingShorts is true
     *    isWarm is false and wearingShorts is false
     *
     *    If these conditions are not met, print: "Uncomfortable clothes"
     */
    private static void exercise1() {
        System.out.println("\nExercise 1 - Comfortable clothes:");

        double temperatureInCelsius = 25;
        double isWarmTemperatureInCelsius = 20;
        boolean isWarm = temperatureInCelsius >= isWarmTemperatureInCelsius;
        boolean wearingShorts = true;

        // Write your code here
        if(isWarm == true && wearingShorts == true)
        {
            System.out.println("The clothes are comfortable");
        }
        else
        {
            System.out.println("The clothes are uncomfortable");
        }
    }

    /**
     * 2: We are going to automate the club bouncer, write a condition with an if statement with the && (and)
     *    to check if someone is able to enter the club.
     *
     *    Their shoeType must be "fancy" AND they must be over 18 AND they must have at least 10 euros in their pocket
     *
     *    Write 1 if statement that checks all of these, print "Come in" if they meet the condition
     *    or "stay out" if they don't.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2 - Club Bouncer:");
        String shoeType = "fancy";



        int age = 30;
        double eurosInPocket = 17.5;
        double eurosForEntry = 10;

        // Write your code here
        if(shoeType == "fancy" && age > 18 && eurosInPocket > eurosForEntry)
        {
            System.out.println("Come it");
        }
        else
        {
            System.out.println("Stay out");
        }
    }

    /**
     * 3: Write an if else statement to calculate our grade
     *
     *    If our grade is 90%+ of the total, we print "A"
     *    If our grade is 80%+ of the total, we print "B"
     *    If our grade is 70%+ of the total, we print "C"
     *    If our grade is 60%+ of the total, we print "D"
     *    If our grade is under 60% of the total, we print "F"
     *
     *    If 'isTestRetry' we cap the maximum grade at C
     *
     *    Remember was can use ! to invert the value of a boolean, i.e. true -> false
     */
    private static void exercise3() {
        System.out.println("\nExercise 3 - Test Grader:");
        double ourTestScore = 10;
        double maxTestScore = 10;
        boolean isTestRetry = true;

        //Write your code here
        double testscoreInpercentage = (ourTestScore / maxTestScore) * 100;
        System.out.println("Percentuale: " + testscoreInpercentage);
        if(isTestRetry == true && testscoreInpercentage >= 90 && testscoreInpercentage >= 80)
        {
            System.out.println("C");
        }
        else if (testscoreInpercentage >= 90)
        {
            System.out.println("A");
        }
        else if(testscoreInpercentage >= 80)
        {
            System.out.println("B");
        }
        else if(testscoreInpercentage >= 70)
        {
            System.out.println("C");
        }
        else if(testscoreInpercentage >= 60)
        {
            System.out.println("D");
        }
        else
        {
            System.out.println("F");
        }
    }


    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ---------------------------------------------------------------------------------
     *    Write a XOR condition, print "safe" if only one car is driving down the road,
     *    print "CRASH! or No cars" if not.
     *
     *    XOR = ^
     */
    private static void exercise4Bonus() {
        System.out.println("\nExercise 4 (Optional) - One way road:");
        boolean carIsDrivingFromLeftToRight = true;
        boolean carIsDrivingFromRightToLeft = true;

        //Write your code here
        if(carIsDrivingFromLeftToRight == true ^ carIsDrivingFromRightToLeft == true)
        {
            System.out.println("CRASH!");
        }
        else
        {
            System.out.println("Safe");
        }
    }
}

