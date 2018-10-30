/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7ex7;
import java.lang.Math;
import java.util.Scanner;
/**
 *
 * @author natesesti
 */
public class Game {
    private int score = 0;
    
    public void play() {
        Scanner input = new Scanner(System.in);
        for (int i = 1;i<=10;i++) {
            System.out.println("Press enter to play the next frame.");
            String enter = input.nextLine();
            frame(i);
        }
        System.out.println("Your final score is: " + score);
    }
    private int bowl(int pinsLeft) {
        return (int)(Math.random()*pinsLeft);
    }
    private void frame(int num) {
        System.out.println("Frame #" + num);
        int pinsDown = bowl(10);
        System.out.println("You knocked down " + pinsDown + " pins on throw one.");
        if (pinsDown == 10) {
            score += 20;
            return;
        }
        pinsDown += bowl(10-pinsDown);
        System.out.println("You knocked over " + pinsDown + " total pins. SCORE: " + score);
        if (pinsDown >= 10) {
            score += 10;
        } else {
            score += pinsDown;
        }
    }
}
