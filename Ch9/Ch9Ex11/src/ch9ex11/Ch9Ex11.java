/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9ex11;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author student
 */
public class Ch9Ex11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] myNums;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items in the array: ");
        int num = input.nextInt();
        myNums = new int[num];
        for (int i = 0;i<num;i++) {
            myNums[i] = (int)(Math.random()*100.0);
        }
        SelectionSort sorter = new SelectionSort(myNums);
        sorter.display(true);
        sorter.display(false);
    }
    
}
