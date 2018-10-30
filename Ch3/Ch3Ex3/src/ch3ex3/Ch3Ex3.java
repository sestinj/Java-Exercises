/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3ex3;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Ch3Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Rent: $");
        int rent = input.nextInt();
        System.out.print("Tuition: $");
        int tuition = input.nextInt();
        System.out.print("Books: $");
        int books = input.nextInt();
        System.out.print("Scholarships: $");
        int scholarships = input.nextInt();
        
        Calculator calc = new Calculator(rent, tuition, books, scholarships);
        calc.printCost();
    }
    
}
