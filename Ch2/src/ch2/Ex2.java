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
public class Ex2 {
    public static void main(String[] args) {
        // TODO code application logic here
        p("Bingo Card");
        p("1. The caller randomly pulls a numbered bingo ball.");
        p("2. The number is placed on the bingo board and called on.");
        p("3. Players look for the called number on their bingo card.");
        p("4. If the number is located, it is marked off.");
        p("5. Steps 1 to 4 are repeated until a player matches the BINGO pattern.");
        p("6. The winning player yells BINGO.");
    }
    public static void p(String txt) {
        System.out.println(txt);
    }
}
