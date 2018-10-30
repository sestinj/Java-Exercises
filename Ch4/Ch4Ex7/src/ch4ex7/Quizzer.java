/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch4ex7;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Quizzer {
    int level;
    public void createQuiz() {
        System.out.println("Equivalent Fractions Quiz");
        String[] frac1 = {"21/3", "2/3", "4/3", "28/4", "8/12", "1 1/3", "5/1", "125/5"};
        String[] frac2 = {"729/81", "1728/144", "1000/50", "90/10", "121/12", "99/9", "777/111", "565/5"};
        String[] frac = new String[8];
        
        Scanner input = new Scanner(System.in);
        System.out.print("What level would you like? \n 1: Beginner \n 2: Advanced \n");
        level = input.nextInt();
        
        if (level == 1) {
            frac = frac1;
        } else {
            frac = frac2;
        }
        
        for (int i = 0; i < 8;i++) {
            System.out.println(i+1 + ". " + frac[i]);
        }
        
        System.out.print("Which fraction is equivalent to fraction #1? #");
        int anw = input.nextInt();
        if (anw == 4) {
            System.out.println("Correct!");
            System.out.println("Your score is 100%.");
        } else {
            System.out.println("Wrong.");
            System.out.println("Your score is 0%.");
        }
        
    }
}
