/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4ex1;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Calculator {
    private int copies;
    
    
    public void setVars() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of copies to be printed: ");
        copies = input.nextInt();
    }
    
    public void printResults() {
        double rate;
        
        if (copies < 100) {
            rate = 0.3;
        } else if (copies < 500) {
            rate = 0.28;
        } else if (copies < 750) {
            rate = 0.27;
        } else if (copies < 1001) {
            rate = 0.26;
        } else {
            rate = 0.25;
        }
        
        
        System.out.println("Price per copy is: $" + rate);
        System.out.println("Total cost is: $" + (double)copies * rate);
    }
}
