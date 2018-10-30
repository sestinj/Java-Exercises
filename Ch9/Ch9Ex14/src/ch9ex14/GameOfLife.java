/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9ex14;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class GameOfLife {
    private boolean[][] plane = new boolean[10][10];
    
    public void setBoard() {
        Scanner input = new Scanner(System.in);
        for (int i = 0;i<10;i++) {
            for (int j = 0;j<10;j++) {
                plane[i][j] = false;
            }
        }
        int num = 1;
        boolean stillGoing = true;
        do {
            System.out.println("Cell #" + num + "(99 to quit)");
            System.out.print("Enter row: ");
            int row = input.nextInt();
            System.out.print("Enter column: ");
            int column = input.nextInt();
            if (row == 99 || column ==99) {
                stillGoing = false;
                break;
            }
            row = Math.min(9, row);
            column = Math.min(9, column);
            plane[row][column] = true;
            num ++;
        }while (stillGoing);
    }
    private void displayPlane() {
        for (int i = 0;i<10;i++) {
            for (int j  = 0;j<10;j++) {
                if (plane[i][j]) {
                    System.out.print("X");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        System.out.println("\n");
    }
    
    public void run() {
        displayPlane();
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Press enter to continue (Type 99 to quit): ");
            String text = input.nextLine();
            updatePlane();
            displayPlane();
            boolean isAlive = false;
            for (int i = 0;i<10;i++) {
                for (int j  = 0;j<10;j++) {
                    if (plane[i][j]) {
                        isAlive = true;
                    }
                }
            }
            if (!isAlive || text == "99") {
                break;
            }
        }
    }
    
    private void updatePlane() {
        for (int i = 0;i<10;i++) {
            for (int j  = 0;j<10;j++) {
                if (plane[i][j]) {
                    if (numNeighbors(i, j) == 2 || numNeighbors(i, j) == 3) {
                        plane[i][j] = true;
                    } else {
                        plane[i][j] = false;
                    }
                } else {
                    if (numNeighbors(i,j) == 3) {
                        plane[i][j] = true;
                    } else {
                        plane[i][j] = false;
                    }
                }
            }
            System.out.println();
        }
    }
    private int numNeighbors(int row, int column) {
       int num = 0;
       for (int i = 0;i<3;i++) {
           for (int j = 0;j<3;j++) {
               if (!(i == 1 && j == 1)) {
                   if(row-1+i >= 0 && row-1+i < plane.length && column-1+j >= 0 && column-1+j < plane[0].length) {
                       if(plane[row-1+i][column-1+j]) {
                           num ++;
                       }
                   }
               }
           }
       }
       return num;
    }
}
