/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8ex3;

/**
 *
 * @author student
 */
public class Minivan extends Vehicle {
    private int seats;
    private boolean hasAutoDoors;
    public Minivan(double price, String name, double mpg, int seats, boolean hasAutoDoors) {
        super(price, name, mpg);
        this.seats = seats;
        this.hasAutoDoors = hasAutoDoors;
    }
    public int getSeats() {
        return seats;
    }
    public boolean getHasAutoDoors() {
        return hasAutoDoors;
    }
}
