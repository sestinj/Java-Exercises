/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5ex18;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Monogrammer {
    private String f;
    private String m;
    private String l;
    
    public void setNames() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        f = input.next();
        f = f.substring(0, 1);
        System.out.print("Enter your middle name: ");
        m = input.next();
        m = m.substring(0, 1);
        System.out.print("Enter your last name: ");
        l = input.next();
        l = l.substring(0, 1);
    }
    public void createMonogram() {
        System.out.println("Your monogram is: " + f.toLowerCase() + l.toUpperCase() + m.toLowerCase());
    }
}
