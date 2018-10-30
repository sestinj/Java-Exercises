/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6ex9;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author natesesti
 */
public class Game {
    private int stones;
    private Scanner input = new Scanner(System.in);
    
    private boolean isValidEntry(int num) {
        if (num > 3) {
            return false;
        } else if (stones < num) {
            return false;
        } else {
            return true;
        }
    }
    
    private int drawStones() {
        return (int)(Math.random()*2+1);
    }
    
    private void userTurn() {
        System.out.print("There are " + stones + " stones. How many would you like? ");
        int entry = input.nextInt();
        while (!isValidEntry(entry)) {
            System.out.print("Enter a valid number(1-3)");
            entry = input.nextInt();
        }
        stones -= entry;
    }
    private void compTurn() {
        int entry = (int)(Math.random()*3+1);
        System.out.println("There are " + stones + " stones. The computer takes " + entry);
        stones -= entry;
    }
    public void play() {
        this.stones = (int)(Math.random()*15+15);
        String turn = "player";
        do {
            if (turn == "player") {
                userTurn();
                turn = "computer";
            } else {
                compTurn();
                turn = "player";
            }
        } while(stones > 0);
        System.out.println("The " + turn + " won!");
    }
}
