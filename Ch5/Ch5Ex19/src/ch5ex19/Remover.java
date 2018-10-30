/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5ex19;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Remover {
    private String remove;
    private String sentence;
    
    public void setVars() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        sentence = input.nextLine();
        System.out.print("Enter a string: ");
        remove = input.nextLine();
    }
    
    public void printRemoved() {
        
        System.out.println(sentence.replaceAll(remove, " "));
        
        
    }
}
