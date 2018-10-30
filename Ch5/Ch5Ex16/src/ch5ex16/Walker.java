/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5ex16;
import java.lang.Math;
/**
 *
 * @author student
 */
public class Walker {
    
    public int walk() {
        int progress = 0;
        int steps = 0;
        do {
            steps ++;
            if (Math.random() <= 0.5) {
                progress --;
            } else {
                progress ++;
            }
        } while (progress<3&&progress>-3);
        return steps;
    }
    
    public void printResults() {
        int total = 0;
        int max = 0;
        for (int i = 0;i<50;i++) {
            int steps = walk();
            total += steps;
            if (steps > max) {
                max = steps;
            }
            System.out.println(steps);
        }
        System.out.println("The average is: " + total/50.0);
        System.out.println("The max is: " + max);
    }
}
