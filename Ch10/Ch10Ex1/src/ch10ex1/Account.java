/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10ex1;
import java.text.NumberFormat;
/**
 *
 * @author student
 */
public class Account {
    private double balance;
    private Customer cust;
    private String acctID;
    
    public Account(double bal, String fName, String lName) {
        balance = bal;
        cust = new Customer(fName, lName);
        acctID = fName.substring(0,1) + lName;
    }
    
    public Account(String ID) {
        balance = 0;
        cust = new Customer("", "");
        acctID = ID;
    }
    public String getID() {
        return(acctID);
    }
    public double getBalance() {
        return(balance);
    }
    public void deposit(double amt) {
        balance += amt;
    }
    public void withdrawal(double amt) {
        if (amt <= balance) {
            balance -= amt;
        } else {
            System.out.println("Not enough money in account.");
        }
    }
    public boolean equals(Object acct) {
        Account testAcct = (Account)acct;
        if (acctID.equals(testAcct.acctID)) {
            return true;
        } else {
            return false;
        }
    }
    
    public String toString() {
        String accountString;
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        accountString = acctID + "\n";
        accountString += cust.toString();
        accountString += "Current balance is " + money.format(balance);
        return accountString;
    }
}
