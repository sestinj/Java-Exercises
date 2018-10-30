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
public class Ex6 {
    public static void main(String[] args) {
        // TODO code application logic here
        p("Tic Tac Toe Rules");
        p("");
        p("1. A grid of 9 squares is drawn.");
        p("");
        p("2. The first player draws an X in an empty square.");
        p("");
        p("3. The second player draws an O in an empty square.");
        p("");
        p("4. Steps 2 and 3 are repeated until a Tic Tac Pattern is created.");
        p("");
        p("5. A winning pattern is completed by drawing a line through the pattern.");
    }
    public static void p(String txt) {
        System.out.println(txt);
    }
}
