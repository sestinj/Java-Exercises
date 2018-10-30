/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3ex11;

/**
 *
 * @author student
 */
public class Calculator {
    private double designing;
    private double coding;
    private double debugging;
    private double testing;
    
    public Calculator(double designing, double coding, double debugging, double testing) {
        this.designing = designing;
        this.coding = coding;
        this.debugging = debugging;
        this.testing = testing;
    }
    
    public void printResults() {
        double total = designing + coding + debugging + testing;
        total /= 100.0;
        
        System.out.format("%-8s %8s", "Task", "% Time" + "\n");
        System.out.format("%-8s %8s", "Designing", designing/total + "%\n");
        System.out.format("%-8s %8s", "Coding", coding/total + "%\n");
        System.out.format("%-8s %8s", "Debugging", debugging/total + "%\n");
        System.out.format("%-8s %8s", "Testing", testing/total, "\n");
    }
}
