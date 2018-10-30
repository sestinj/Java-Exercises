/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5ex1;

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
    
    public boolean checkPrime(int num) {
        boolean isPrime = true;
        for (int i=num-1;i>1;i--) {
            if (num%i == 0) {
                isPrime = false;
                return false;
            }
        }
        return true;
    }
    public void printPrimes() {
        System.out.println("The prime numbers between those two are: ");
        int step = 1;
        if (num1 > num2) {
            step = -1;
        }
        
        for (int i = num1;i<=num2;i+=step) {
            if (checkPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
