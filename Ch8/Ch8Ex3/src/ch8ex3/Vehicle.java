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
public class Vehicle {
    private double price;
    private String name;
    private double mpg;
    
    public Vehicle(double price, String name, double mpg) {
        this.price = price;
        this.name = name;
        this.mpg = mpg;
    }
    
    public double getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public double getMPG() {
        return mpg;
    }
}
