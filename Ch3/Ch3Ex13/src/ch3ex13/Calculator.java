/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3ex13;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Calculator {
    double amt;
    double yrs;
    double rt;
    
    public void setVars() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the desired amount: ");
        amt = input.nextDouble();
        System.out.print("Enter the number of years: ");
        yrs = input.nextDouble();
        System.out.print("Enter the interest rate: ");
        rt = input.nextDouble();
    }
    
    public void printValue() {
        System.out.println("The principal needed is: " + amt/(1+yrs*rt));
    }
}
