/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package craps;

/**
 *
 * @author natesesti
 */
public class Player {
    private int numBrains;
    private int numShotguns;
    private int numRunners;
    public int getNumBrains() {
        return numBrains;
    }
    public void addBrains(int num) {
        numBrains += num;
    }
    public int getNumShotguns() {
        return numShotguns;
    }
    public void addShotguns(int num) {
        numShotguns += num;
    }
    public int getNumRunners() {
        return numShotguns;
    }
    public void addRunners(int num) {
        numRunners += num;
    }
    
    public int playerNumber;
    
    public Player(int number) {
        this.playerNumber = number;
        this.numBrains = 0;
        this.numShotguns = 0;
        this.numShotguns = 0;
    }
}
