/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5ex21;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Assigner {
    private String initial;
    
    public void setNames() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String first = input.next();
        System.out.print("Enter your last name: ");
        initial = input.next().substring(0, 1).toLowerCase();
    }
    public void assignGroup() {
        String g1 = "abcdefghi";
        for (int i = 0;i<g1.length();i++) {
            if (initial.equals(g1.substring(i, i+1))) {
                System.out.println("You are assigned to group #1");
                return;
            }
        }
        String g2 = "jklmnopqrs";
        for (int i = 0;i<g2.length();i++) {
            if (initial.equals(g2.substring(i, i+1))) {
                System.out.println("You are assigned to group #2");
                return;
            }
        }
        System.out.println("You are assigned to group #3");
    }
}
