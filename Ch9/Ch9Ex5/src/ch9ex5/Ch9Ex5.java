/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9ex5;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Ch9Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of pegs to use (1-10): ");
        int pegs = input.nextInt();
        System.out.print("Enter the number of colors to use (1-9): ");
        int colors = input.nextInt();
        MastermindGame game = new MastermindGame(pegs, colors);
        game.play();
    }
    
}
