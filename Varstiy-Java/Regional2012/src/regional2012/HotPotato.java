/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regional2012;
import java.util.ArrayList;
import java.lang.Math;
/**
 *
 * @author student
 */
public class HotPotato {
    private int numberOfPlayers;
    private int passesBeforeElimination;
    private boolean cycleIsRandom;
    //The list contains a boolean for each player, indicating if they are still in the game.
    private ArrayList<Integer> list;
    public HotPotato(int numberOfPlayers, int passesBeforeElimination, boolean cycleIsRandom) {
        this.numberOfPlayers = numberOfPlayers;
        this.passesBeforeElimination = passesBeforeElimination;
        this.cycleIsRandom = cycleIsRandom;
        this.list = new ArrayList<Integer>();
        for (int i = 0;i<numberOfPlayers;i++) {                                                                                                                                                                                                            
            list.add(new Integer(i+1));
        }
    }
    //This function runs the simulation of the game of hot potato, then returns the number of the player that won.
    public int playGame() {
        int potatoLocation = 0;
        while (!gameIsOver()) {
            potatoLocation += passesBeforeElimination;
            while (potatoLocation >= list.size()) {
                potatoLocation -= list.size();
            }
            list.remove(potatoLocation);
            if (cycleIsRandom) {
                passesBeforeElimination = (int)(Math.random()*list.size());
            }
        }
        return list.get(0).intValue();
    }
    //Checks if the game is over (if there is only one player left)
    private boolean gameIsOver() {
        if (list.size() <= 1) {
            return true;
        } else {
            return false;
        }
    }
}
