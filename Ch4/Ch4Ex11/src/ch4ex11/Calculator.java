/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4ex11;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author student
 */
public class Calculator {
    private double a;
    private double b;
    private double c;
    
    public void setVars() {
        Scanner input = new Scanner(System.in);
        System.out.print("Etner value for a: ");
        a = input.nextDouble();
        System.out.print("Etner value for b: ");
        b = input.nextDouble();
        System.out.print("Etner value for c: ");
        c = input.nextDouble();
    }
    public void printAnsw() {
        double root1 = (-b + Math.sqrt(b*b - 4.0*a*c))/(2.0*a);
        double root2 = (-b - Math.sqrt(b*b - 4.0*a*c))/(2.0*a);
        System.out.println("The roots are " + root1 + " and " + root2);
    }
}
