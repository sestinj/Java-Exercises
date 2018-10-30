/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4ex15;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author student
 */
public class Calculator {
    private double k;
    private int prob;
    private double n;
    private double t;
    private double y;
    private Scanner input;
    
    public void decideProblem() {
        input = new Scanner(System.in);
        System.out.println("1. Final Amount");
        System.out.println("2. initial Amount");
        System.out.println("3. Constant (half-life)");
        System.out.print("Find: ");
        prob = input.nextInt();
        
        switch (prob) {
            case 1:
                solve1();
            case 2:
                solve2();
            default:
                solve3();
        }
    }
    public void solve1() {
        setN();
        setK();
        setT();
        System.out.println("Final mass: " + n*Math.exp(-k*t));
    }
    public void solve2() {
        setY();
        setK();
        setT();
        System.out.println("Initial mass: " + y/Math.exp(-k*t));
    }
    public void solve3() {
        setN();
        setY();
        setT();
        System.out.println("Half-Life: " + Math.log(y/n)/t);
    }
    
    public void setT() {
        System.out.print("Enter the elapsed time in years: ");
        t = input.nextDouble();
    }
    public void setK() {
        System.out.print("Enter the the half-life: ");
        k = input.nextDouble();
    }
    public void setY() {
        System.out.print("Enter the final mass: ");
        y = input.nextDouble();
    }
    public void setN() {
        System.out.print("Enter the initial mass: ");
        n = input.nextDouble();
    }
}
