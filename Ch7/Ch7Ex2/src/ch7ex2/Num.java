/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7ex2;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Num {
    private int num;
    public void setNum() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        this.num = input.nextInt();
        boolean stillGoing = true;
        while (stillGoing) {
            this.displayMenu();
            String choice = input.next();
            
            
            switch (choice.toLowerCase()) {
                case "w":
                    System.out.println("The number is: " + num);
                    break;
                case "o":
                    o();
                    break;
                case "t":
                    t();
                    break;
                case "h":
                    h();
                    break;
                case "q":
                    stillGoing = false;
                    break;
            }
        }
        
    }
    private void displayMenu() {
        System.out.println("show (W)hole number.");
        System.out.println("show (O)nes place number.");
        System.out.println("show (T)ens place number.");
        System.out.println("show (H)undreds place number.");
        System.out.println(" (Q)uit");
        System.out.print("Enter your choice: ");
    }
    
    private void o() {
        System.out.println("The ones place digit is: " + num%10);
    }
    private void t() {
        System.out.println("The tens place digit is: " + (num%100-num%10)/10);
    }
    private void h() {
        System.out.println("The hundreds place digit is: " + (num-num%100)/100);
    }
}
