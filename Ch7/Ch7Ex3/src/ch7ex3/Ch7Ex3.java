/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch7ex3;

/**
 *
 * @author student
 */
public class Ch7Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Food burger = new Food(1.85, 9, 33, 1, "hamburger");
        burger.display();
        Food salad = new Food(2, 1, 11, 5, "salad");
        salad.display();
        Food fries = new Food(1.3, 11, 36, 4, "french fries");
        fries.display();
        Food soda = new Food(0.95, 0, 38, 0, "soda");
        soda.display();
        System.out.println("Your order comes to: $" + (burger.price+salad.price+fries.price+soda.price));
    }
    
}
