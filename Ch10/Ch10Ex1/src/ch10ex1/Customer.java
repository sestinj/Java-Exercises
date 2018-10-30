/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10ex1;

/**
 *
 * @author student
 */
public class Customer {
    private String fName, lName;
    
    public Customer(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }
    public String toString() {
        return fName + " " + lName + "\n";
    }
}
