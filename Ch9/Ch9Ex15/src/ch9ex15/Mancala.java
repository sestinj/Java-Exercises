/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9ex15;
import java.lang.Math;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Mancala {
    private int[] pits = new int[14];
    private Scanner input = new Scanner(System.in);
    //Bin 0 is the user's home bin. Bin 7 is the opponents. The bins move clockwise.
    private void pl(String txt) {
        System.out.println(txt);
    }
    private void p(String txt) {
        System.out.print(txt);
    }
    private void displayBoard() {
        for (int i=1;i<7;i++) {
            p(" " + pits[i]);
        }
        pl("");
        pl(pits[0] + "           " + pits[7]);
        for (int i = 0;i<6;i++) {
            int index = 13-i;
            p(" " + pits[index]);
        }
        pl("");
        pl(" A B C D E F ");
    }
        
    public void play() {
        //Setup pits
        for (int i = 0;i<14;i++) {
            if (i==0||i==7) {
                pits[i] = 0;
            } else {
                pits[i] = 3;
            }
        }
        int currentTurn = 7;
        while (true) {
            displayBoard();
            int startPit = 13;
            if (currentTurn == 7) {
                System.out.println("Enter a letter: ");
                switch(input.next().toLowerCase()) {
                    case "a":
                        startPit = 13;
                        break;
                    case "b":
                        startPit = 12;
                        break;
                    case "c":
                        startPit = 11;
                        break;
                    case "d":
                        startPit = 10;
                        break;
                    case "e":
                        startPit = 9;
                        break;
                    case "f":
                        startPit = 8;
                        break;
                }
            } else {
                startPit = (int)(Math.random()*6)+1;
            }
            
            //currentTurn is 7 for the users turn and 0 for the computer. It also represents the home pits of the opposite player.

            boolean canPlay = false;
            for (int i = 1+Math.abs(currentTurn - 7);i<7+Math.abs(currentTurn - 7);i++) {
                if (pits[i] != 0) {
                    canPlay = true;
                }
            }
            if (!canPlay) {
                pl("GAME OVER.");
                if (pits[0] > pits[7]) {
                    pl("You won.");
                } else if (pits[7] > pits[0]) {
                    pl("The computer won.");
                } else {
                    pl("It was a tie.");
                }
                break;
            }
            
            
            int numStones = pits[startPit];
            pits[startPit] = 0;
            int extra = 0;
            int currPit = startPit;
            for (int i = 1;i<=numStones+extra;i++) {
                currPit = startPit - i;
                if (currPit < 0) {
                    currPit = 13;
                }
                if (currPit == currentTurn) {
                    extra ++;
                } else {
                    pits[currPit] ++; 
                    if (i==numStones) {
                        int expression = pits[currPit];
                        if (currPit == expression) {
                            currentTurn = Math.abs(currentTurn - 7);
                        } else if (currPit > Math.abs(currentTurn - 7) && currPit < Math.abs(currentTurn - 7)+7) {
                            pits[Math.abs(currentTurn - 7)] += pits[currPit];
                            pits[currPit] = 0;
                        }
                    }
                }
            }
            currentTurn = Math.abs(currentTurn - 7);
        }
        
    }
}
