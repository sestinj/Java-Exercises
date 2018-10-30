/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7ex4;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author natesesti
 */
public class DRPlayer {
    private Scanner input = new Scanner(System.in);
    
    private int d1;
    private int d2;
    private int points = 1000;
    
    private void roll() {
        d1 = (int)Math.random()*5+1;
        d2 = (int)Math.random()*5+1;
    }
    
    public void play() {
        do {
            System.out.println("You have " + points + " points.");
            System.out.print("How many points do you want to risk? (-1 to quit): ");
            int risk = input.nextInt();
            if (risk == -1) {
                break;
            }
            System.out.print("Make a call (0 for low, 1 for high): ");
            int call = input.nextInt();
            this.roll();
            System.out.println("You rolled: " + (d1+d2));
            if ((call==0&&(d1+d2)<7)||(call==1&&(d1+d2)>7)) {
                points += 2*risk;
            } else {
                points -= risk;
            }
        } while (points > 0);
        System.out.println("Game over.");
    }
}
