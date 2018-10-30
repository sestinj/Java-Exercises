/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3ex10;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class Calculator {
    private int burgers;
    private int fries;
    private int sodas;
    
    public Calculator(int burgers, int fries, int sodas) {
        this.burgers = burgers;
        this.fries = fries;
        this.sodas = sodas;
    }
    public void printResults() {
        Scanner input = new Scanner(System.in);
        double beforeTax = 1.69*((double)burgers) + 1.09*(double)fries + 0.99*(double)sodas;
        double tax = 0.065*beforeTax;
        double total = beforeTax + tax;
        System.out.println("Total before tax: $" + beforeTax);
        System.out.println("Tax: $" + tax);
        System.out.println("Final total: $" + total);
        
        System.out.print("Enter amount tendered: $");
        double tendered = input.nextDouble();
        System.out.println("Change: $" + (tendered - total));
    }
}
