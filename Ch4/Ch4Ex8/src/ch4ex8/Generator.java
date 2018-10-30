/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4ex8;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Generator {
    private int seed;
    private int a;
    private int c;
    private int m;
    
    public Generator(int seed, int a, int c, int m) {
        this.seed = seed;
        this.a = a;
        this.c = c;
        this.m = m;
    }
    
    public void printOutput() {
        System.out.println("Seed = " + seed + ", a = " + a + ", c = " + c + ", m = " + m);
        System.out.println();
        int x = seed;
        for (int i=0;i<=10;i++) {
            int result = (a*x + c) % m;
            System.out.println("(" + a + "*" + x + " + " + c + ") % " + m + "=" + result);
            x = result;
        }
    }
}
