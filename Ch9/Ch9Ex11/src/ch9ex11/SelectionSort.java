/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9ex11;

/**
 *
 * @author student
 */
public class SelectionSort {
    private int[] originalArray;
    private int[] sortedArray;
    public SelectionSort(int[] array) {
        this.originalArray = array;
        this.sortedArray = new int[array.length];
    }
    public void display(boolean original) {
        if (!original) {
            sort();
            System.out.println("Sorted: ");
        }
        int[] array = sortedArray;
        if (original) {
            System.out.println("Original: ");
            array = originalArray;
        }
        for (int i : array) {
            System.out.println(i);
        }
    }
    private void sort() {
        for (int i = 0; i < sortedArray.length;i++) {
            int idx = findLowest();
            sortedArray[i] = originalArray[idx];
            originalArray[idx] = Integer.MAX_VALUE;
        }
    }
    private int findLowest() {
        int lowNum = Integer.MAX_VALUE;
        int lowIndex = 0;
        for (int i = 0;i<originalArray.length;i++) {
            if (originalArray[i] < lowNum) {
                lowNum = originalArray[i];
                lowIndex = i;
            }
        }
        return lowIndex;
    }
}
