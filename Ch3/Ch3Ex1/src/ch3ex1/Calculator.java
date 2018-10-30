/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3ex1;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Calculator {
    private double time;
    public void setTime() {
        System.out.print("Enter a timeless than 4.5 seconds:");
        Scanner input = new Scanner(System.in);
        this.time = input.nextDouble();
    }
     
    public void printHeight() {
        System.out.println("The height of the object is: " + (100.0 -  4.9*time*time) + " meters");
    }
}
