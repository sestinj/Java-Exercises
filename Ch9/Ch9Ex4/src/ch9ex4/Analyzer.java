/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9ex4;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Analyzer {
    private ArrayList<Integer> nums = new ArrayList<Integer>();
    public void getNumbers() {
        Scanner input = new Scanner(System.in);
        int num = 0;
        while (num != 99) {
            System.out.println("Enter a number from 1 to 50 (99 to end): ");
            num = input.nextInt();
            if (num != 99) {
                nums.add(new Integer(num));
            }
            
        }
    }
    public void analyze() {
        double sum = 0.0;
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            sum += num;
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        sum /= nums.size();
        System.out.println("The average of the numbers entered are: " + sum);
        System.out.println("The maximum number entered is: " + max);
        System.out.println("The values have a range: " + (max-min));
        int[] occur = new int[50];
        for (int i = 0;i<50;i++) {
            occur[i] = 0;
        }
        for (Integer num: nums) {
            occur[num.intValue()] ++;
        }
        int median = 0;
        for (int i = 0;i<50;i++) {
            if (occur[i]>median) {
                median = i;
            }
        }
        System.out.println("The median value is: " + median);
        System.out.println("A histogram of the data appears like:");
        for(int i=1;i<=46;i+=5) {
            String asterisks = "";
            for (Integer num : nums) {
                if (num.compareTo(i) >= 0 && num.compareTo(i) <= i+4) {
                    asterisks += "*";
                }
            }
            System.out.format("%-2s %2s %2s %2s", i, "-", i+4, ": " + asterisks + "\n");
        }
    }
}
