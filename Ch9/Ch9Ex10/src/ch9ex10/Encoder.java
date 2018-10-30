/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9ex10;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Encoder {
    private String word;
    private char[] string;
    public void setString() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        word = input.nextLine();
        string = new char[word.length()];
        for (int i=0;i<word.length();i++) {
            string[i] = word.charAt(i);
        }
    }
    public void printResults() {
        
        String message = "";
        for (char a : string) {
            message += (char)(a+2);
        }
        System.out.println("Encoded message: " + message);
    }
}
