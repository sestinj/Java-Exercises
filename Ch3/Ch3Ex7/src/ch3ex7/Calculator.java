/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3ex7;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Calculator {
    private int int1;
    private int int2;
    
    public void setInts() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int1 = input.nextInt();
        System.out.print("Enter another integer: ");
        int2 = input.nextInt();
    }
    
    public void printInts() {
        System.out.println(int1 + " / " + int2 + " = " + (int1/int2));
        System.out.println(int1 + " % " + int2 + " = " + (int1%int2));
        System.out.println();
        System.out.println(int2 + " / " + int1 + " = " + (int2/int1));
        System.out.println(int2 + " % " + int1 + " = " + (int2%int1));
    }
}
