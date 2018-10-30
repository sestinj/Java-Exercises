/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9ex5;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author student
 */
public class MastermindGame {
    private int pegs;
    private int colors;
    private int[] pattern;
    public MastermindGame(int pegs, int colors) {
        this.pegs = pegs;
        this.colors = colors;
        pattern = new int[pegs];
        for (int i=0;i<pegs;i++) {
            pattern[i] = (int)(Math.random()*(colors-1))+1;
        }
    }
    
    public void play() {
        Scanner input = new Scanner(System.in);
        boolean codeBroken = false;
        int guesses = 0;
        do {
            guesses ++;
            int[] guess = new int[pegs];
            System.out.println("Guess #" + guesses);
            int correctPegs = 0;
            int correctColors = 0;
            for(int i=0;i<pegs;i++) {
                System.out.print("Color for peg " + (i+1) + ": ");
                guess[i] = input.nextInt();
                if (guess[i] == pattern[i]) {
                    correctPegs ++;
                }
            }
            
            for(int i = 1;i<=colors;i++) {
                boolean patternContains = false;
                boolean guessContains = false;
                for (int num:pattern) {
                    if (num == i) {
                        patternContains = true;
                    }
                }
                for (int num:guess) {
                    if (num == i) {
                        guessContains = true;
                    }
                }
                if (guessContains && patternContains) {
                    correctColors ++;
                }
            }
            
            System.out.println("You have " + correctPegs + " peg(s) correct and " + correctColors + " color(s) correct.");
            if (correctPegs >= pegs) {
                codeBroken = true;
            }
        }while (!codeBroken);
        System.out.println("You Win!");
    }
}
