/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9ex8;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class PalindromeChecker {
    private char[] wordLetters;
    
    public void setWord() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = input.nextLine();
        word = word.replaceAll(" ", "");
        wordLetters = new char[word.length()];
        for (int i=0;i<word.length();i++) {
            wordLetters[i] = word.charAt(i);
        }
    }
    public void printResult() {
        boolean isPal = true;
        for (int i = 0; i < wordLetters.length/2;i++) {
            if (wordLetters[i] != wordLetters[wordLetters.length-1-i]) {
                isPal = false;
            }
        }
        if (isPal) {
            System.out.println("That is a palindrome.");
        } else {
            System.out.println("That is not a palindrome.");
        }
    }
    
}
