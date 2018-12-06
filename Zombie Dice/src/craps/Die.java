/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package craps;
import java.awt.*;
/**
 *
 * @author natesesti
 */
public class Die {
    
    public Die(Color color) {this.color = color;}
    
    private DiceState state;
    private Color color;
    public Color getColor() {
        return color;
    }
    public void roll() {
        double rand = Math.random();
        if (this.color == Color.red) {
            if (rand < 0.5) {
                state = DiceState.shotgun;
            } else if (rand < 0.7) {
                state = DiceState.brain;
            } else {
                state = DiceState.runner;
            }
        } else if (this.color == color.yellow) {
            if (rand < 0.4) {
                state = DiceState.shotgun;
            } else if (rand < 0.7) {
                state = DiceState.brain;
            } else {
                state = DiceState.runner;
            }
        } else {
            if (rand < 0.3) {
                state = DiceState.shotgun;
            } else if (rand < 0.7) {
                state = DiceState.brain;
            } else {
                state = DiceState.runner;
            }
        }
    }
    public DiceState getState() {
        return state;
    }
}
enum DiceState {
    brain, shotgun, runner;
}

