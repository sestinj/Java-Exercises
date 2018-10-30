/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3ex8;

/**
 *
 * @author student
 */
public class Converter {
    private int time;
    private int mins;
    private int hours;
    
    public Converter(int time) {
        this.time = time;
        
        this.mins = time%60;
        this.hours = (time - this.mins)/60;
    }
    
    public int getMins() {
        return this.mins;
    }
    public int getHours() {
        return this.hours;
    }
}
