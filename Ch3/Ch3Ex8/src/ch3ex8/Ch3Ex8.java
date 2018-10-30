/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3ex8;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Ch3Ex8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a time in minutes: ");
        
        Converter conv = new Converter(input.nextInt());
        
        System.out.println("The time is: " + conv.getHours() + ":" + conv.getMins());
    }
    
}
