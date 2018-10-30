/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8ex2;

import java.text.NumberFormat;

/**
 *
 * @author student
 */
public class Account {
    private double balance;
    private String name;
    
    public Account(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }
    
    public double getBalance() {
        return this.balance;
    }
    
    public void deposit(double amt) {
        this.balance += amt;
    }
    
    public void withdrawal(double amt) {
        if (amt <= balance) {
            balance -= amt;
        } else {
            System.out.println("Not enough money in account.");
        }
    }
    public String toString() {
        String accountString;
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        accountString = name;
        accountString += " - Current balance is " + money.format(balance);
        return accountString;
    }
}
