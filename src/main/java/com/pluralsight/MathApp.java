package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        // Question 1:

        // declare variables here

        // then code solution
        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        // REPEAT FOR NEXT EXERCISE

        //QUESTIONS:
        //1. Create two variables to represent the salary for Bob and Gary, name them
        //bobSalary and garySalary. Create a new variable named
        //highestSalary. Determine whose salary is greater using Math.max() and
        //store the answer in highestSalary.  Set the initial salary variables to any value
        //you want. Print the answer (i.e "The highest salary is …")
        System.out.println();
        System.out.println("                         ***** Exercises ***** ");
        System.out.println();
        System.out.println();
        System.out.println("Question 1 Find out the higher salary");
            double bobSalary;
            double garySalary;
            double highestSalary;
            bobSalary =  7500;
            garySalary = 7550;

        highestSalary = Math.max(bobSalary,garySalary);
        System.out.println("The highest salary is " + highestSalary);
        System.out.println("-------------------------------------------------------------------------");

        //2. Find and display the smallest of two variables named carPrice and
        //truckPrice.  Set the variables to any value you want.
        System.out.println("Question 2: Smaller amount");
            double carPrice;
            double truckPrice;
            double cheapVehicle;
            carPrice =    18500;
            truckPrice =  35000;
        cheapVehicle = Math.min(carPrice,truckPrice);
        System.out.println("The cheaper vehicle" + cheapVehicle);
        System.out.println("-------------------------------------------------------------------------");

        //3. Find and display the area of a circle whose radius is 7.25
        System.out.println("Question 3: Display Area of circle");
            double areaOfCircle;
         double radius = 7.25;
        //  A=πr2 i
        areaOfCircle = (radius*radius)*Math.PI;
        System.out.println("Area of the circle is " + areaOfCircle);
        System.out.println("-------------------------------------------------------------------------");

        //4. Find and display the square root a variable after it is set to 5.0
        System.out.println("Question 4: Display square root of a variable");
            double unknownValue;
            double squareRoot;
             unknownValue = 5;
        squareRoot= (unknownValue * unknownValue);
        System.out.println("The square root of 5 is "+ squareRoot);
        System.out.println("-------------------------------------------------------------------------");

        //5. Find and display the distance between the points (5, 10) and (85, 50)
        System.out.println("Question 5: Distance between points: ");
            int schoolPointA= 5;
            int schoolPointB= 10;
            int homePointA= 85;
             int homePointB= 50;
        double distanceBetween = Math.sqrt(Math.pow(homePointA - schoolPointA, 2) + Math.pow(homePointB - schoolPointB, 2));
        System.out.println("The distance between the two points is " + distanceBetween);
        System.out.println("-------------------------------------------------------------------------");

        //6. Find and display the absolute (positive) value of a variable after it is set to -3.8
        System.out.println("Question 6: Display absolute number: ");
            double variableNonAbsolute = -3.8;
            double absoluteValue = Math.abs(variableNonAbsolute);
        System.out.println("Our absolute value is " + absoluteValue);
        System.out.println("-------------------------------------------------------------------------");

        //7. Find and display a random number between 0 and 1;
        System.out.println("Question 7: Display a Random Number");
            int minNumberRandom = 0;
            int maxNumberRandom = 100;
            double randomNumber = Math.random();
        System.out.println("my Random Number is "+ randomNumber);
    }
}
