/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5ex3;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author student
 */
public class Calculator {
    
    
    private double init;
    private double fin;
    private double rate;
    
    public void setVars() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the initial amount: ");
        init = input.nextDouble();
        System.out.print("Enter the final amount: ");
        fin = input.nextDouble();
        System.out.print("Enter the rate: ");
        rate = input.nextDouble();
    }
    public void printResult() {
        int y = 0;
        rate ++;
        while (init < fin) {
            init*=Math.abs(rate);
            y++;
        }
        System.out.println("This will take " + y + " years.");
    }
}
