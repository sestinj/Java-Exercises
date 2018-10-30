/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5ex15;
import java.lang.Math;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class ChaosMaker {
    private double start;
    private double a;
    public void setVars() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a starting number between 0 and 1: ");
        start = input.nextDouble();
        System.out.print("Enter a coefficient between 2 and 4: ");
        a = input.nextDouble();
    }
    public void generate() {
        System.out.println(start);
        for (int i = 1;i<=50;i++) {
            start = a*start*(start-1.0);
            System.out.println(start);
        }
    }
}
