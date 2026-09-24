package com.game;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        // 0 = Rock
        // 1 = Paper
        // 2 = Scissor


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor: ");
        int userInput = sc.nextInt();
        // Showing userInput

        if (userInput == 0){
            System.out.println("You choose: Rock");
        }
        else if (userInput == 1) {
            System.out.println("You choose: Paper");
        }
        else if (userInput == 2) {
            System.out.println("You choose: Scissor");
        }

        Random random = new Random();
        int comInput = random.nextInt(3);
        // Showing comInput

        if (comInput == 0){
            System.out.println("Computer choose: Rock");
        }
        else if (comInput == 1) {
            System.out.println("Computer choose: Paper");
        }
        else if (comInput == 2) {
            System.out.println("Computer choose: Scissor");
        }

        // Main condition for code/game
        if (userInput == comInput){
            System.out.println("Draw!");
        }

        else if (userInput == 0 && comInput == 1 || userInput == 0 && comInput == 2
                || userInput == 2 && comInput == 1){
            System.out.println("You Win!");
        }

        else {
            System.out.println("Computer Win!");
            System.out.println("Better Luck Next Time..!");
        }

    }
}
