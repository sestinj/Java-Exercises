/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5ex9;
import java.lang.Math;
/**
 *
 * @author student
 */
public class TableMaker {
    public void makeTable() {
        System.out.format("%-8s %8s %8s %8s %8s", "x^1", "x^2", "x^3", "x^4", "x^5\n");
        for (double i = 1;i<=5;i++) {
            System.out.format("%-8s %8s %8s %8s %8s", (int)Math.pow(i, 1), (int)Math.pow(i, 2), (int)Math.pow(i, 3), (int)Math.pow(i, 4), (int)Math.pow(i, 5) + "\n");
        }
    }
}
