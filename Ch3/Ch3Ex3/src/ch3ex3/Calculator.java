/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3ex3;

/**
 *
 * @author student
 */
public class Calculator {
    private int rent;
    private int tuition;
    private int books;
    private int scholarships;
    
    public Calculator(int rent, int tuition, int books, int scholarships) {
        this.rent = rent;
        this.tuition = tuition;
        this.books = books;
        this.scholarships = scholarships;
    }
    public void printCost() {
        int total = rent + tuition + books - scholarships;
        System.out.println("The amount of money you will need for college is: $" + total);
    }
}
