/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5ex10;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Calculator {
    private int num1;
    private int num2;
    
    public void setNums() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num1 = input.nextInt();
        System.out.print("Enter another number: ");
        num2 = input.nextInt();
    }
    public void printGCD() {
        while (num2 > 0) {
            int temp = num1 % num2;
            num1 = num2;
            num2 = temp;
        }
        System.out.println("The GCD is " + num1);
    }
}
