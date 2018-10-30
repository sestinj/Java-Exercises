/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7ex1;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class PiggyBank {
    private double total;
    private Scanner input = new Scanner(System.in);
    public void showMenu() {
        boolean stillGoing = true;
        System.out.println("1. Show total in bank.");
        System.out.println("2. Add a penny.");
        System.out.println("3. Add a nickel.");
        System.out.println("4. Add a dime.");
        System.out.println("5. Add a quarter.");
        System.out.println("6. Take money out of bank.");
        System.out.println("Enter 0 to quit");
        while (stillGoing) {
            
            System.out.print("Enter your choice: ");
        
        
            int choice = input.nextInt();
        
            if (choice == 0) {
                stillGoing = false;
            } else if ( choice == 1) {
                this.printTotal();
            } else if (choice == 2) {
                addAmount(0.01);
            } else if (choice == 2) {
                addAmount(0.05);
            } else if (choice == 3) {
                addAmount(0.1);
            } else if (choice == 4) {
               addAmount(0.25);
            } else {
               removeMoney();
            }
            System.out.println();
        }
        
    }
    private void removeMoney() {
        System.out.print("Enter the amount you want to remove: ");
        double amount = input.nextDouble();
        addAmount(-1.0*amount);
    }
    private void addAmount(double amount) {
        total += amount;
    }
    private void printTotal() {
        System.out.println("Your total is: $" + total);
    }
    
}
