/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3ex12;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Calculator {
    
    private double food;
    private double clothing;
    private double entertainment;
    private double rent;
    
    public void setVars() {
        System.out.println("Enter the amount spent last month on the following items: \n");
        Scanner input = new Scanner(System.in);
        
        System.out.print("Food: $");
        food = input.nextDouble();
        System.out.print("Clothing: $");
        clothing = input.nextDouble();
        System.out.print("Entertainment: $");
        entertainment = input.nextDouble();
        System.out.print("Rent: $");
        rent = input.nextDouble();
    }
    public void printResults() {
        double total = food + clothing + entertainment + rent;
        total /= 100.0;
        
        System.out.format("%-8s %18s", "Category", "Budget\n");
        System.out.format("%-8s %18s", "Food", food/total + "%\n");
        System.out.format("%-8s %18s", "Clothing", clothing/total + "%\n");
        System.out.format("%-8s %14s", "Entertainment", entertainment/total + "%\n");
        System.out.format("%-8s %18s", "Rent", rent/total + "%\n");
    }
}
