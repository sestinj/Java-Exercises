/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3ex9;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Ch3Ex9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your birthdate: ");
        
        System.out.print("Year: ");
        int year = input.nextInt();
        System.out.println();
        
        System.out.print("Month: ");
        int month = input.nextInt();
        System.out.println();
        
        System.out.print("Day: ");
        int day = input.nextInt();
        System.out.println();
        
        
        System.out.println("Enter today's date: ");
        
        System.out.print("Year: ");
        int currYear = input.nextInt();
        System.out.println();
        
        System.out.print("Month: ");
        int currMonth = input.nextInt();
        System.out.println();
        
        System.out.print("Day: ");
        int currDay = input.nextInt();
        System.out.println();
        
        Calculator calc = new Calculator(year, month, day, currYear, currMonth, currDay);
        calc.printOutput();
    }
    
}
