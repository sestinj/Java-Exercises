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
public class Ch8Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Car sedan = new Car(500, "Sedan", 50, 240, true);
        Truck ram = new Truck(750, "Ram", 35, 800, 400);
        Minivan chrysler = new Minivan(600, "Chrysler", 40, 7, true);
        System.out.println(sedan.getName());
        System.out.println(ram.getName());
        System.out.println(chrysler.getName());
    }
}
