/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4ex5;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Converter {
    double grade;
    
    public void setGrade() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the percentage: ");
        grade = input.nextDouble();
    }
    
    public void printLetter() {
        String letter;
        if (grade >= 90) {
            letter = "A";
        } else if (grade >= 80) {
            letter = "B";
        } else if (grade >= 70) {
            letter = "C";
        } else if (grade >= 60) {
            letter = "D";
        } else {
            letter = "F";
        }
        System.out.println("The corresponding letter grade is: " + letter);
    }
}
