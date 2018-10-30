/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6ex8;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author natesesti
 */
public class Game {
    public void playGame() {
        int points = 1000;
        int guesses = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("High Low Game");
        System.out.println("RULES");
        System.out.println("Numbers 1-6 are low.");
        System.out.println("Numbers 8-13 are high.");
        System.out.println("Number 7 is neither high or low.");
        System.out.println();
        
        do {
            guesses ++;
            System.out.println("You have " + points + " points.");
            System.out.println();
            System.out.print("Enter points to risk: ");
            int risk = input.nextInt();
            System.out.println();
            System.out.print("Predict <1=high, 0=low>: ");
            int guess = input.nextInt();
            int num = (int)(Math.random()*12+1);
            System.out.println("Number is " + num);
            if ((num<7&&guess==0)||(num>7&&guess==1)) {
                System.out.println("You win.");
                points += 2*risk;
            } else {
                System.out.println("You guessed wrong.");
                points -= risk;
            }
            
        } while(points > 0);
        System.out.println("It took you " + guesses + " turns to lose your points.");
    }
}
