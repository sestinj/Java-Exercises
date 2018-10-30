/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6ex6;
import java.lang.Math;
/**
 *
 * @author natesesti
 */
public class Calculator {
    public boolean perfectSquare(int num) {
        if (Math.sqrt((double)num)-(double)num < 0.0001) {
            return true;
        } else {
            return false;
        }
    }
    
    public void printResults() {
        for (int a = 1;a < 100;a++) {
            for (int b = 1;b<100;b++) {
                int cSquared = (int)(Math.pow((double)a, 2.0) + Math.pow((double)b, 2.0));
                if (perfectSquare(cSquared) == true) {
                    System.out.println("A: " + a + "   B: " + b + "   C: " + (int)Math.sqrt((double)cSquared));
                }
            }
        }
    }
}
