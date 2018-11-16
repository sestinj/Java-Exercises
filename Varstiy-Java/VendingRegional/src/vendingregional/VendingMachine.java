/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingregional;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author natesesti
 */
public class VendingMachine {
    Console console;
    
    
    private int itemsSelected = 0;
    private double salesTotal = 0;
    private String[] names = {"Notebook Paper", "Mechanical Pencils (3 Pack)", "3 Ring Binder", "Pens (3 Pack)(Black, Red, Blue", "Folder", "Highlighter", "Clear Transaction", "Exit and Pay", "Cancel and Exit"};
    private double[] prices = {2, 1, 3, 1, 0.75, 0.5, 0, 0, 0};
    private String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "X"};
    private int[] amounts = {0, 0, 0, 0, 0, 0};
            
    public VendingMachine() {
        this.console = System.console();
    }
    
    private void doAction(String choice) {
        int index = 0;
        for(int i = 0;i<alphabet.length;i++){if(alphabet[i]==choice){index=1;}}
        if(prices[index] == 0) {
            switch(choice) {
                case "G":
                    itemsSelected = 0;
                    salesTotal = 0;
                    for (int j=0;j<amounts.length;j++){amounts[j]=0;}
                    break;
                case "H":
                    showFinal();
                    break;
                case "X":
                    itemsSelected = 0;
                    salesTotal = 0;
                    for (int j=0;j<amounts.length;j++){amounts[j]=0;}
                    showFinal();
                    break;
            }
        } else {
            amounts[index] ++;
            itemsSelected ++;
            
        }
    }
    private void showFinal() {
        
    }
}