/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7ex8;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author natesesti
 */
public class Adder {
    private int score = 0;
    
    public void play() {
        Scanner input = new Scanner(System.in);
        while (true) {
            int i1 = rand();
            int i2 = rand();
            int answ = i1+i2;
            int earned = 5;
            System.out.print(i1 + " + " + i2 + " = ");
            for (int i=0;i<3;i++) {
                int guess = input.nextInt();
                if (guess == 999) {
                    System.out.println("Your score is: " + score);
                    return;
                }
                if (guess == answ) {
                    score += earned;
                    break;
                } else {
                    System.out.print("Wrong answer. Try another answer: ");
                    earned -= 2;
                }
            }
        }
    }
    private int rand() {
        return (int)(Math.random()*20);
    }
}
