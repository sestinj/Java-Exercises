/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3ex6;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Calculator {
    private int num;
    public void setNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        num = input.nextInt();
    }
    
    public void printDigits() {
        int hun = (num - num%100)/100;
        int ten = (num - num%10 - hun*100)/10;
        System.out.println("The hundreds place digit is: " + hun);
        System.out.println("The tens place digit is: " + ten);
        System.out.println("The ones place digit is: " + num%10);
    }
}
