/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5ex17;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Login {
    private String password = "no";
    
    public void log_in() {
        Scanner input = new Scanner(System.in);
        String guess = "";
        int num = 0;
        do {
            num ++;
            System.out.print("Enter the password: ");
            guess = input.next();
            if (!guess.equals(this.password)) {
                System.out.println("The password you typed is incorrect.");
            }
        } while((!guess.equals(this.password))&&num<3);
        if (guess.equals(this.password)) {
            System.out.println("Welcome.");
        } else {
            System.out.println("Access Denied.");
        }
    }
}
