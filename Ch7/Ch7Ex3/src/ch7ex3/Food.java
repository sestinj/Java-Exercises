/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7ex3;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Food {
    public double price;
    private double fat;
    private double carbs;
    private double fiber;
    private String name;
    public Food(double price, double fat, double carbs, double fiber, String name) {
        this.price = price;
        this.fat = fat;
        this.carbs = carbs;
        this.fiber = fiber;
        this.name = name;
    }
    
    public void display() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of " + name + "s: ");
        int ham = input.nextInt();
        price = price*ham;
        System.out.println("Each " + name + " has " + fat + "g of fat, " + carbs + "g of carbs, and " + fiber +  "g of fiber");
    }
}
