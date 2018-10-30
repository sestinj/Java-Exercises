/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5ex8;

import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author student
 */
public class Game {
    private int num;
    
    public void play() {
        int guess;
        num = (int)(Math.random()*19+1);
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter a number between 1 and 20: ");
            guess = input.nextInt();
            if (guess > num) {
                System.out.println("Too high.");
            } else if (guess < num) {
                System.out.println("Too low.");
            }
        } while (guess != num);
        System.out.println("You won!");
    }
}
