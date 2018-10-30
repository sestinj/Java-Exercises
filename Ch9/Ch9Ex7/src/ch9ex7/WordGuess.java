/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9ex7;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author student
 */
public class WordGuess {
    public void play() {
        ArrayList<String> alreadyGuessed = new ArrayList<String>();
        
        final String SECRET_WORD = "BRAIN";
        final String FLAG = "!";
        String wordSoFar = "", updatedWord = "";
        String letterGuess, wordGuess = "";
        int numGuesses = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("WordGuess game. \n");
        for (int i = 0; i< SECRET_WORD.length();i++) {
            wordSoFar += "-";
        }
        System.out.println(wordSoFar + "\n");
        
        do {
            System.out.print("Enter a letter (" + FLAG + " to guess the entire word): ");
            letterGuess = input.nextLine();
            letterGuess = letterGuess.toUpperCase();
            
            while (alreadyGuessed.contains(letterGuess)) {
                System.out.print("You have already entered that letter. Try again: ");
                letterGuess = input.nextLine();
                letterGuess = letterGuess.toUpperCase();
            }
            
                
                
            alreadyGuessed.add(letterGuess);
            
            numGuesses ++;
            if (SECRET_WORD.indexOf(letterGuess)>=0) {
                updatedWord = wordSoFar.substring(0, SECRET_WORD.indexOf(letterGuess));
                updatedWord += letterGuess;
                updatedWord += wordSoFar.substring(SECRET_WORD.indexOf(letterGuess)+1, wordSoFar.length());
                wordSoFar = updatedWord;
            }
            System.out.println(wordSoFar + "\n");
        } while (!letterGuess.equals(FLAG) && !wordSoFar.equals(SECRET_WORD));
        
        if (letterGuess.equals(FLAG)) {
            System.out.println("What is your guess?");
            wordGuess = input.nextLine();
            wordGuess = wordGuess.toUpperCase();
        }
        if (wordGuess.equals(SECRET_WORD) || wordSoFar.equals(SECRET_WORD)) {
            System.out.println("You won!");
        } else {
            System.out.println("Sorry. You lose.");
        }
        System.out.println("The secret word is " + SECRET_WORD);
        System.out.println("You made " + numGuesses + " guesses.");
    }
}
