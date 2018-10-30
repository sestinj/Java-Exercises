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
public class Truck extends Vehicle {
    private double bedSize;
    private double horsePower;
    public Truck(double price, String name, double mpg, double bedSize, double horsePower) {
        super(price, name, mpg);
        this.bedSize = bedSize;
        this.horsePower = horsePower;
    }
    public double getBedSize() {
        return bedSize;
    }
    public double getHorsePower() {
        return horsePower;
    }
}
