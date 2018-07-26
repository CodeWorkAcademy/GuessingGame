package com.company;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args)
    {
        Random rnd = new Random();
        Scanner keyboard =  new Scanner(System.in);
        int guess;
        boolean notDone = true;
        int myNumber = rnd.nextInt(10) + 1;

        System.out.println(
                "I have chosen a number between 1 and 10. Try to guess it.");

        while(notDone)
        {
            System.out.println("Your guess: ");
            guess = keyboard.nextInt();

            if (guess == myNumber)
            {
                System.out.println("That's right! You're a good guesser.");
                notDone = false;
            } else {
                System.out.println("That is incorrect. Guess again.");
            }
        }
    }
}