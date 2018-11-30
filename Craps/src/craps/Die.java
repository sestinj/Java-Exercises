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
public class Die {
    
    public Die() {}
    public int dots;
    public void roll() {this.dots = (int)(Math.random()*5+1);}
    public int getNumDots() {return this.dots;}
}
