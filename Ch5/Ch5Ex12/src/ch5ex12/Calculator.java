/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5ex12;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private int num1;
    private int num2;
    
    public void setNums() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first starting number: ");
        num1 = input.nextInt();
        firstNumber = num1;
        System.out.print("Enter the second first starting number: ");
        num2 = input.nextInt();
        secondNumber = num2;
    }
    public void printResults() {
        System.out.print(num1 + " " + num2 + " ");
        
        do {
            int temp1 = num1;
            num1 = num2;
            num2 = temp1+num1;
            num2 = num2 - ((int)((double)num2/10.0)*10);
            System.out.print(num2 + " ");
        } while (!(num2 == secondNumber && num1 == firstNumber));
    }
}
