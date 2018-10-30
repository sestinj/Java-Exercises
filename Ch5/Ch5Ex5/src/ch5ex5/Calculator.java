/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5ex5;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Calculator {
    int num;
    
    public void setNum() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        num = input.nextInt();
    }
    public void printDigits() {
        while (num != 0) {
            int newNum = num/10;
            newNum*=10;
            System.out.println(num-newNum);
            num = newNum/10;
        }
    }
}
