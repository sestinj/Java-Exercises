/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3ex2;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Calculator {
    private double diam;
    
    public void setDiameter() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the diameter of the pizza in inches: ");
        diam = input.nextDouble();
    }
    
    public void printCost() {
        System.out.println("The cost of making the pizza is: $" + (1.75 + 0.05*diam*diam));
    }
}
