/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4ex2;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Scale {
    private int weight;
    private int height;
    private int length;
    private int width;
    
    public void weighAndMeasure() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter package weight in kilograms: ");
        weight = input.nextInt();
        System.out.print("Enter package length in centimeters: ");
        length = input.nextInt();
        System.out.print("Enter package width in centimeters: ");
        width = input.nextInt();
        System.out.print("Enter package height in centimeters: ");
        height = input.nextInt();
    }
    
    public void printResults() {
        boolean tooHeavy = false;
        boolean tooLarge = false;
        
        if (weight > 27) {
            tooHeavy = true;
        }
        if (length*width*height > 100000) {
            tooLarge = true;
        }
        
        if (tooHeavy) {
            if (tooLarge) {
                System.out.println("Too heavy and too large.");
            } else {
                System.out.println("Too heavy.");
            }
        } else if (tooLarge) {
            System.out.println("Too large.");
        }
    }
}
