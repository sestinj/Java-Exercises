/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4ex12;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author student
 */
public class Calculator {
    private double x;
    private double y;
    
    public void setVars() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for X: ");
        x = input.nextDouble();
        System.out.print("Enter a value for Y: ");
        y = input.nextDouble();
    }
    public void compareAnswers() {
        System.out.println("The result from using the formula is: " + Math.pow(Math.E,y*Math.log(x)));
        System.out.println("The result from using the Math pow() method is: " + Math.pow(x, y));
    }
}
