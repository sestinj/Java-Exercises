/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6ex2;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Converter {
    private double num;
    private int method;
    public void decideMethod() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = input.nextDouble();
        System.out.println("Convert: ");
        System.out.println("1. Inches to Centimeters   5. Centimeters to Inches");
        System.out.println("2. Feet to Centimeters     6. Centimeters to Feet");
        System.out.println("3. Yards to Meters         7. Meters to Yards");
        System.out.println("4. Miles to Kilometers     8. Kilometers to Miles");
        System.out.print("Enter your choice: ");
        method = input.nextInt();
        
        if (method == 1) {
            m1();
        } else if (method == 2) {
            m2();
        } else if (method == 3) {
            m3();
        } else if (method == 4) {
            m4();
        } else if (method == 5) {
            m5();
        } else if (method == 6) {
            m6();
        } else if (method == 7) {
            m7();
        } else if (method == 8) {
            m8();
        }
    }
    private void m1() {
        System.out.println(num + " inches equals " + num*2.54 + " centimeters");
    }
    private void m2() {
        System.out.println(num + " feet equals " + num*30 + " centimeters");
    }
    private void m3() {
        System.out.println(num + " yards equals " + num*0.91 + " meters");
    }
    private void m4() {
        System.out.println(num + " miles equals " + num*1.6 + " kilometers");
    }
    private void m5() {
        System.out.println(num + " centimeters equals " + num/2.54 + " inches");
    }
    private void m6() {
        System.out.println(num + " centimeters equals " + num/30 + " feet");
    }
    private void m7() {
        System.out.println(num + " meters equals " + num/0.91 + " yards");
    }
    private void m8() {
        System.out.println(num + " kilometers equals " + num/1.6 + " miles");
    }
    
}
