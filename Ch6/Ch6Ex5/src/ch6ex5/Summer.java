/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6ex5;
import java.util.Scanner;
/**
 *
 * @author natesesti
 */
public class Summer {
    
    public void run() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your total coins: ");
        System.out.print("Quarters: ");
        int q = input.nextInt();
        System.out.print("Dimes: ");
        int d = input.nextInt();
        System.out.print("Nickels: ");
        int n = input.nextInt();
        System.out.print("Pennies: ");
        int p = input.nextInt();
        System.out.println(getDollarAmount(q, d, n, p));
    }
    public String getDollarAmount(int q, int d, int n, int p) {
        double tot = 0.25*q + 0.1*d + 0.05*n + 0.01*p;
        return "$" + tot;
    }
}
