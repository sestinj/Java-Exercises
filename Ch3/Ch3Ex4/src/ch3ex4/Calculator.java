/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3ex4;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Calculator {
    private double mass;
    
    public void setMass() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the mass in kilograms: ");
        this.mass = input.nextDouble();
    }
    
    public void printEnergy() {
        double energy = (mass*3.0*3.0*100000000*100000000);
        System.out.println("The energy produced in Joules is = " + energy);
        System.out.println("The number of 100-watt light bulbs powered = " + energy/360000);
    }
}
