/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9ex3;
import java.lang.Math;
/**
 *
 * @author student
 */
public class RandomGenerator {
    private int[] nums = new int[500];
    private int[] totals = new int[10];
    public void generate() {
        for (int i = 0;i<500;i++) {
            nums[i] = (int)(Math.random()*9);
        }
        for (int num : nums) {
            totals[num] += 1;
        }
    }
    public void printResults() {
        System.out.format("%-8s %8s", "Number", "Occurences\n");
        for (int i = 0;i<9;i++) {
            System.out.format("%-8s %8s", i, totals[i] + "\n");
        }
    }
}
