/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3ex11;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Ch3Ex11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Designing: ");
        double designing = input.nextDouble();
        System.out.print("Codig: ");
        double coding = input.nextDouble();
        System.out.print("Debugging: ");
        double debugging = input.nextDouble();
        System.out.print("Testing: ");
        double testing = input.nextDouble();
        
        Calculator calc = new Calculator(designing, coding, debugging, testing);
        calc.printResults();
    }
    
}
