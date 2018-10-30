/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4ex16;
import java.lang.Math;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class Calculator {
    private double theta;
    
    public void setAngle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an angle in degrees: ");
        theta = Math.toRadians(input.nextDouble());
        
    }
    public void printFunctions() {
        System.out.println("Sine: " + Math.sin(theta));
        System.out.println("Cosine: " + Math.cos(theta));
        System.out.println("Tangent: " + Math.tan(theta));
    }
}
