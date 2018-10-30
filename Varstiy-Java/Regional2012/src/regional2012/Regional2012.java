 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regional2012;
import java.util.Scanner;
import java.lang.Integer;
/**
 *
 * @author student
 */
public class Regional2012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numPlayers = Integer.parseInt(args[0]);
        int passes = Integer.parseInt(args[1]);
        boolean isRandom = args[2] == "randomize";
        if (numPlayers == numPlayers) {
            HotPotato game = new HotPotato(numPlayers, passes, isRandom);
            System.out.println("The winner is: " + game.playGame());
        } else {
            System.out.println("java Josephus players passes [randomize]");
        }
    }
    
}
