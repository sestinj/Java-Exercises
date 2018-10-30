/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9ex1;
import java.util.ArrayList;
import java.lang.Math;
/**
 *
 * @author student
 */
public class EvenOdds {
    private int[] nums = new int[25];
    public void generate() {
        for (int i=0;i<25;i++) {
            nums[i] = (int) (Math.random()*99);
        }
        System.out.println("ODD:");
        for (int num: nums) {
            if(num%2==0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        System.out.println("EVEN:");
        for (int num: nums) {
            if(num%2!=0) {
                System.out.print(num + " ");
            }
        }
    }
}
