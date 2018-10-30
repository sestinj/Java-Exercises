/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3ex10;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Ch3Ex10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Enter the number of burgers: ");
        int burgers = input.nextInt();
        System.out.print("Enter the number of fries: ");
        int fries = input.nextInt();
        System.out.print("Enter the number of sodas: ");
        int sodas = input.nextInt();
        
        Calculator calc = new Calculator(burgers, fries, sodas);
        
        double beforeTax = 1.69*((double)burgers) + 1.09*(double)fries + 0.99*(double)sodas;
        double tax = 0.065*beforeTax;
        double total = beforeTax + tax;
        System.out.println("Total before tax: $" + beforeTax);
        System.out.println("Tax: $" + tax);
        System.out.println("Final total: $" + total);
        
        System.out.print("Enter amount tendered: $");
        double tendered = input.nextDouble();
        System.out.println("Change: $" + (tendered - total));
    }
    
}
