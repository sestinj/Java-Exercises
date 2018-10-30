/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7ex6;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author natesesti
 */
public class Game {
    public void play() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("\n\n");
            System.out.println("The player closest to 21 wins.");
            int d1 = draw();
            int d2 = draw();
            System.out.println("Your cards are: " + d1 + " and " + d2);
            System.out.print("Do you want another card? (1=yes, 0=no, -1=quit): ");
            int d3 = 0;
            int in = input.nextInt();
            if (in == 1) {
                d3 = draw();
            } else if (in == -1) {
                break;
            }
            System.out.println("Your total is: " + (d1+d2+d3));
            if (d1+d2+d3>21) {
                boolean isAce = false;
                if (d1 == 11) {
                    isAce = true;
                    d1 = 1;
                }
                if (d2 ==11&&d1+d2+d3>21) {
                    isAce = true;
                    d2 = 1;
                }
                if (d3 ==11&&d1+d2+d3>21) {
                    isAce = true;
                    d3 = 1;
                }
                if (!isAce) {
                    System.out.println("You lost.");
                    continue;
                }
            }
            int compScore = computer();
            System.out.println("The computer's total is: " + compScore);
            if (compScore > 21 || compScore < d1+d2+d3) {
                System.out.println("You won!");
            } else if (compScore > d1+d2+d3){
                System.out.println("The computer won.");
            } else {
                System.out.println("It's a tie!");
            }
            
        }
        
    }
    private int draw() {
        int num = (int)(Math.random() * 12 + 1);
        if (num > 10) {
            num = 10;
        } else if (num == 1) {
            num = 11;
        }
        return num;
    }
    private int computer() {
        int d1 = draw();
        int d2 = draw();
        int d3 = 0;
        
        if(d1+d2 < 16) {
            d3 = draw();
        }
        if (d1+d2+d3 > 21) {
            if (d1 == 11) {
                d1 = 1;
            }
            if (d2 == 11&&d1+d2+d3>21) {
                d2 = 1;
            }
            if (d3 == 11&&d1+d2+d3>21) {
                d3 = 1;
            }
        }
        return d1+d2+d3;
    }
}
