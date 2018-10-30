/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4ex14;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author student
 */
public class Calculator {
    private double n;
    private double k;
    private double t;
    
    public void setVars() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter initial bacteria amount: ");
        n = input.nextDouble();
        System.out.print("Enter a constant value for k: ");
        k = input.nextDouble();
        System.out.print("Enter the growth time period in hours: ");
        t = input.nextDouble();
    }
    public void printResult() {
        double result = n*Math.exp(k*t);
        System.out.println((int)result + "bacteria will be present after " + t + " hours.");
    }
}
