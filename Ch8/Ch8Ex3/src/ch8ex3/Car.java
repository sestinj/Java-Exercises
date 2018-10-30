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
public class Car extends Vehicle {
    private double trunkSize;
    private boolean has4Doors;
    public Car(double price, String name, double mpg, double trunkSize, boolean has4Doors) {
        super(price, name, mpg);
        this.trunkSize = trunkSize;
        this.has4Doors = has4Doors;
    }
    public double getTrunkSize() {
        return trunkSize;
    }
    public boolean getHas4Doors() {
        return has4Doors;
    }
}
