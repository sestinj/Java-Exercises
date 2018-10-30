/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4ex9;
import java.lang.Math;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Computer {
    private int num;
    
    public void setNum() {
        num = (int)(Math.random()*20.0);
    }
    
    public void playGame() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 20: ");
        int guess = input.nextInt();
        System.out.println("Computer's number: " + num);
        System.out.println("Player's number: " + guess);
        if (num == guess) {
            System.out.println("You won!");
        } else {
            System.out.println("Better luck next time.");
        }
    }
}
