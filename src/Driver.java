/*

    Kayla Irish
    CSCI 136 Spring 2020
    Lab #2 Dice Throws
    January 20, 2020

    Concepts: Random Number Generator, Loops, Formatted Output
    Sources: my brother's brain
    work on: putting else if, change Scanner from n to Scanner


    To do what alex did:
        //declare a string pair

        String pair;

        in the for loop:

            for ...;
                pair = "";


                if (first == second) {
                    pair = : " You threw a pair!";

            System.out.printf("%d %d%s\n", first, second, pair);
*/

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //creates a scanner object.
        System.out.println("How many times would you like to throw the dice?"); //prompts user to enter amount of times to roll
        int timesRolled = scanner.nextInt(); // takes user's inputted integer and saves it in a variable

        int firstRoll; //initializes first dice for use in the loop
        int secondRoll; //second dice
        int sumOfAllRolls = 0; //creates variable to be used to save roll sums

        for (int i = 0; i < timesRolled; i++) {
            firstRoll = (int) (Math.random() * 6 + 1); //generates dice roll # between 1 and 6
            secondRoll = (int) (Math.random() * 6 + 1); //same as above

            sumOfAllRolls = sumOfAllRolls + firstRoll + secondRoll; //adds values of rolls to variable during loop (will be used for average)

            if (firstRoll == secondRoll) { //condition that rolls are the same
                System.out.printf("%d %d You rolled a double!\n", firstRoll, secondRoll); //prints each roll for user
            }
            if (firstRoll != secondRoll) { //condition that rolls are not same
                System.out.printf("%d %d\n", firstRoll, secondRoll); //prints each roll for user
            }
        }

        double average = sumOfAllRolls / timesRolled / 2.0; //variable calculates average (all rolls / times rolled / amount of dice
        System.out.printf("The average of your rolls is %.1f.", average); //outputs the average to the user

    }
}
