/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4ex10;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author student
 */
public class Calculator {
    private double l;
    private double w;
    private double h;
    private double d;
    private double s;
    
    public void prism() {
        Scanner input = new Scanner(System.in);
        System.out.println("Rectangular Prism");
        System.out.print("Enter the length: ");
        l = input.nextDouble();
        System.out.print("Enter the width: ");
        w = input.nextDouble();
        System.out.print("Enter the height: ");
        h = input.nextDouble();
        
        System.out.println("The volume is: " + l*w*h);
    }
    public void sphere() {
        Scanner input = new Scanner(System.in);
        System.out.println("Sphere");
        System.out.print("Enter the diameter: ");
        d = input.nextDouble();
        
        System.out.println("The volume is: " + Math.PI*d*d*d/6);
    }
    public void cube() {
        Scanner input = new Scanner(System.in);
        System.out.println("Cube");
        System.out.print("Enter the length of each side: ");
        s = input.nextDouble();
        
        System.out.println("The volume is: " + s*s*s);
    }
}
