/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9ex9;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Counter {
    private String word;
    private char[] string;
    public void setString() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        word = input.nextLine();
        word = word.replaceAll(" ", "");
        string = new char[word.length()];
        for (int i=0;i<word.length();i++) {
            string[i] = word.toLowerCase().charAt(i);
        }
    }
    public void printResults() {
        int count = 0;
        char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
        for (char a : string) {
            for (char b : consonants) {
                if (a == b) {
                    count ++;
                }
            }
        }
        System.out.println("The number of consonants in " + word + " is " + count);
    }
}
