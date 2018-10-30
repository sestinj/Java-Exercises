/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5ex7;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class Calculator {
    private int num;
    
    public void setNum() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        num = input.nextInt();
    }
    
    public int getSum(int number) {
        int total = 0;
        while (number != 0) {
            int newNum = number/10;
            newNum*=10;
            int a = number-newNum;
            total += a*a*a;
            number = newNum/10;
        } 
        return total;
    }
    
    public void printNums() {
        System.out.println("The following numbers are equal to the sum of their cubes.");
        for(int i=10;i<10000;i++) {
            if (getSum(i) == i) {
                System.out.println(i);
            }
        }
    }
}
