/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4ex3;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Calculator {
    int eggs;
    public void setVar() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of eggs purchased: ");
        eggs = input.nextInt();
    }
    
    public void printResults() {
        double rate;
        if (eggs < 48) {
            rate = 0.5;
        } else if (eggs < 72) {
            rate = 0.45;
        } else if (eggs < 132) {
            rate = 0.4;
        } else {
            rate = 0.35;
        }
        System.out.println("The bill is equal to: $" + (double)eggs*rate/12.0);
    }
}
