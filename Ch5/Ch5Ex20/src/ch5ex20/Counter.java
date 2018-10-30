/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5ex20;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Counter {
    private String string;
    
    public void setString() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        string = input.nextLine();
        
    }
    public void countVowels() {
        String initialString = string;
        string = string.toLowerCase();
        string = string.replaceAll("a", "");
        string = string.replaceAll("e", "");
        string = string.replaceAll("u", "");
        string = string.replaceAll("i", "");
        string = string.replaceAll("o", "");
        System.out.println("The number of vowels is: " + (initialString.length()-string.length()));
    }
}
