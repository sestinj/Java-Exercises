/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3ex5;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Calculator {
    private int change;
    private int quarters = 0;
    private int dimes = 0;
    private int nickels = 0;
    private int pennies = 0;
    
    public void setChange() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the change in cents: ");
        change = input.nextInt();
    }
    
    public void calculateCoins() {
        while (change >= 25) {
            change -= 25;
            quarters += 1;
        }
        while (change >= 10) {
            change -= 10;
            dimes += 1;
        }
        while (change >= 5) {
            change -= 5;
            nickels += 1;
        }
        while (change >= 1) {
            change -= 1;
            pennies += 1;
        }
    }
    
    public void printCoins() {
        System.out.println("The minimum number of coins is:");
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
    }
}
