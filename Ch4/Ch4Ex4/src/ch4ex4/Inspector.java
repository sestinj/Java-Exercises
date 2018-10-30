/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4ex4;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Inspector {
    int model;
    
    public void setModel() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the car's model number: ");
        int modelNum = input.nextInt();
    }
    
    public void printResults() {
        int[] nums = {119, 179, 189, 190, 191, 192, 193, 194, 195, 221, 780};
        boolean isDefective = false;
        for (int i=0;i<nums.length;i++) {
            if (model == nums[i]) {
                isDefective = true;
            }
        }
        if (isDefective) {
            System.out.println("Your car is defective. It must be repaired.");
        } else {
            System.out.println("Your car is not defective.");
        }
    }
}
