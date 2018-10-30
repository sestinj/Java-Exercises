/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9ex13;
import java.lang.Math;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class PennyPitch {
    String[][] board;
    int[] prizesWon = {0, 0, 0, 0, 0};
    public void play() {
        this.initBoard();
        Scanner input = new Scanner(System.in);
        for (int i =  0;i<10;i++) {
            System.out.println("Throw #" + (i+1) + ". Press enter to continue.");
            input.nextLine();
            
            boolean prizePlaced = false;
            while (!prizePlaced) {
                int x = (int)(Math.random()*4);
                int y = (int)(Math.random()*4);
                if (board[x][y] != "$") {
                    if(board[x][y] != " ") {
                        System.out.println("You hit prize #" + board[x][y]);
                    }
                    switch (board[x][y]) {
                        case "1":
                            prizesWon[0] ++;
                            break;
                        case "2":
                            prizesWon[1] ++;
                            break;
                        case "3":
                            prizesWon[2] ++;
                            break;
                        case "4":
                            prizesWon[3] ++;
                            break;
                        case "5":
                            prizesWon[4] ++;
                            break;
                    }
                    board[x][y] = "$";
                    prizePlaced = true;
                }
            }
            drawBoard();
        }
        for (int i = 0;i<5;i++) {
            if (prizesWon[i] >= 3) {
                System.out.println("You won prize #" + (i+1) + "!");
            }
        }
    }
    
    private void drawBoard() {
        for (int i = 0;i<5;i++) {
            for (int j =0;j<5;j++) {
                System.out.print("[" + board[i][j] + "]");
            }
            System.out.println();
        }
        System.out.println("\n");
    }
    private void initBoard() {
        board = new String[5][5];
        for (int i = 0;i<5;i++)  {
            for (int j = 0;j<5;j++) {
                board[i][j] = " ";
            }
        }
        String[] prizes = {"1", "2", "3", "4", "5"};
        for (String prize : prizes) {
            for (int i = 0;i<3;i++) {
                boolean prizePlaced = false;
                while (!prizePlaced) {
                    int x = (int)(Math.random()*4);
                    int y = (int)(Math.random()*4);
                    if (board[x][y] == " ") {
                        board[x][y] = prize;
                        prizePlaced = true;
                    }
                }
            }
            
        }
    }
}
