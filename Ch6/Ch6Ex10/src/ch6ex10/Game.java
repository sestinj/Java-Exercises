/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6ex10;

import java.util.Scanner;

/**
 *
 * @author natesesti
 */
public class Game {
    private int num;
    private void giveHint(boolean high) {
        if (high) {
            System.out.println("Too high.");
            
        } else {
            System.out.println("Too low.");
        }
    }
    public void play() {
        int guess;
        num = (int)(Math.random()*19+1);
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter a number between 1 and 20: ");
            guess = input.nextInt();
            if (guess > num) {
                giveHint(true);
            } else if (guess < num) {
                giveHint(false);
            }
        } while (guess != num);
        System.out.println("You won!");
    }
}
