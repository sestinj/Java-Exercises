/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regional2011;
import java.util.Scanner;
import java.lang.String;
import java.lang.CharSequence;
import java.lang.Character;
/**
 *
 * @author student
 */
public class Checker {
    private String id;
    public String getID() {
        return id;
    }
    public void setID() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter id: ");
        id = input.next();
    }
    public boolean checkID() {
        Character firstChar = new Character(id.charAt(0));
        if (!Character.isAlphabetic(firstChar.charValue()) && !firstChar.equals(new Character('_'))) {
            return false;
        }
        for (int i = 0;i<id.length()-1;i++) {
            System.out.println("I");
            if (id.substring(i, i+1).equals("_")) {
                System.out.println("Found _");
                if (id.substring(i+1, i+2).equals("_")) {
                    System.out.println("Found ____");
                    return false;
                }
            }
        }
        
        for (int i = 0;i<id.length();i++) {
            char curr = id.charAt(i);
            if (!Character.isAlphabetic(curr) && !Character.isDigit(curr) && !(curr == '_')) {
                return false;
            }
            
        }
        
        return true;
    }
}
