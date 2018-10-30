/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4ex13;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author student
 */
public class Calculator {
    private double p;
    private double r;
    private double m;
    
    public void setVars() {
        Scanner input = new Scanner(System.in);
        System.out.print("Principal: ");
        p = input.nextDouble();
        System.out.print("Interest Rate: ");
        r = input.nextDouble();
        System.out.print("Number of monthly payments: ");
        m = input.nextDouble();
    }
    public void printResult() {
        double result = (p*r/12.0)/(1-Math.pow(1+r/12.0, -m));
        System.out.println("Th monthly payment is $ " + result);
    }
}
