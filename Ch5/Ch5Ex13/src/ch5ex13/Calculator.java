/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5ex13;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Calculator {
    public void check() {
        int maxIter = 0;
        int maxStart = 0;
        int first = 0;
        int second = 0;
        int third = 0;
        for (int i=1;i<=200;i++) {
            System.out.println(i);
            third = i;
            int iter = 0;
            do {
                iter ++;
                first = second;
                second = third;
                if (i%2==0) {
                    third /= 2;
                } else {
                    third = 3*third + 1;
                }
            } while (first!=4&&second!=2&&third!=1);
            if (iter > maxIter) {
                maxIter = iter;
                maxStart = i;
            }
        }
        System.out.println("Max Iterations = " + maxIter + "\n Starting Number = " + maxStart);
    }
}
