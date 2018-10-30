/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4ex6;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Tutor {
    int o1;
    int o2;
    String op;
    int answ;
    public void makeProb() {
        o1 = (int)(Math.random()*10.0);
        o2 = (int)(Math.random()*10.0);
        double rand = Math.random();
        if (rand < 0.25) {
            answ = o1+o2;
            op = "+";
        } else if (rand < 0.5) {
            answ = o1-o2;
            op = "-";
        } else if (rand < 0.75) {
            answ = o1*o2;
            op = "*";
        } else {
            answ = o1/o2;
            op = "/";
        }
    }
    public void askProb() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is " + o1 + op + o2 + "? ");
        int inputtedAnswer = input.nextInt();
        if (inputtedAnswer == answ) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong.");
        }
    }
}
