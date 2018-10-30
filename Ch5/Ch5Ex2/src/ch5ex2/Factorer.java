/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5ex2;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Factorer {
    private int num;
    public void setNum() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to factor: ");
        num = input.nextInt();
    }
    public void printFactors() {
        System.out.println("The prime factorization of " + num + " is made of the following numbers: ");
        for (int i = 2;i<=num;i++) {
            if (num%i == 0) {
                System.out.println(i);
                num/=i;
                i--;
            }
        }
    }
}
