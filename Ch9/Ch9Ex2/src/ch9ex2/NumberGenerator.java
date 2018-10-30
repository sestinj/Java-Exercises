/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9ex2;

/**
 *
 * @author student
 */
public class NumberGenerator {
    private int[] nums = new int[11];
    
    public void generate() {
        for(int i = 0;i<11;i++) {
            nums[i] = i + (i%10) + (i-i%10)/10;
        }
    }
    public void printNums() {
        System.out.format("%-8s %8s", "Index", "Generated Number\n");
        for (int i = 0;i<11;i++) {
            System.out.format("%-8s %8s", i, nums[i] + "\n");
        }
    }
}
