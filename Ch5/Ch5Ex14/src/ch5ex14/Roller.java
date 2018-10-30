/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5ex14;
import java.lang.Math;
/**
 *
 * @author student
 */
public class Roller {
    public int roll() {
        return (int)(Math.random()*5.0 + 1.0);
    }
    public void printRolls() {
        System.out.format("%-8s %8s %8s", "Dice 1", "Dice 2", "Dice 3\n");
        for (int i = 1;i<=5;i++) {
            int roll1 = roll();
            int roll2 = roll();
            System.out.format("%-8s %8s %8s", roll1, roll2, (roll1+roll2)+"\n");
        }
    }
}
