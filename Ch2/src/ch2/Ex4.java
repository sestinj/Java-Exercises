/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2;

/**
 *
 * @author student
 */
public class Ex4 {
    public static void main(String[] args) {
        // TODO code application logic here
        p("Rock Paper Scissors Rules");
        p("");
        p("Players decide on different hand signals to represent rock, paper, and scissors.");
        p("");
        p("Players make a throw at the same time.");
        p("");
        p("The hand signals thrown by the players are then compared to the rules of the game to determine the winner:");
        p("");
        p("     Rock dulls scissors <Rock wins>.");
        p("");
        p("     Scissors cuts paper <Scissors wins>.");
        p("");
        p("     Paper covers rock <Paper wins>.");
    }
    public static void p(String txt) {
        System.out.println(txt);
    }
}
