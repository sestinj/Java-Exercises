/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10ex1;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Bank {
    private ArrayList accounts = new ArrayList();
    private Scanner input = new Scanner(System.in);
    public void addAccount(String fName, String lName, double balance) {
        Account newAcct = new Account(balance, fName, lName);
        accounts.add(newAcct);
        pl("Account created. Account ID is: " + newAcct.getID());
    }
    private void p(String txt) {
        System.out.print(txt);
    }
    private void pl(String txt) {
        System.out.println(txt);
    }
    public void deleteAccount(String acctID) {
        int acctIndex;
        Account acctToMatch;
        
        acctToMatch = new Account(acctID);
        acctIndex = accounts.indexOf(acctToMatch);
        if (acctIndex > -1) {
            accounts.remove(acctIndex);
            pl("Account removed.");
        } else {
            pl("Account doesn't exist.");
        }
    }
    public void transaction(int transCode, String acctID, double amt) {
        int acctIndex;
        Account acctToMatch;
        
        acctToMatch = new Account(acctID);
        acctIndex = accounts.indexOf(acctToMatch);
        if (acctIndex > -1) {
            Account acct = (Account)accounts.get(acctIndex);
            if (transCode == 1) {
                acct.deposit(amt);
                accounts.set(acctIndex,acct);
                pl(acct.toString());
            } else if (transCode == 2) {
                acct.withdrawal(amt);
                accounts.set(acctIndex,acct);
                pl(acct.toString());
            }
        } else {
            pl("Account does not exist.");
        }
    }
    public void checkBalance(String acctID) {
        int acctIndex;
        Account acctToMatch;
        
        acctToMatch = new Account(acctID);
        acctIndex = accounts.indexOf(acctToMatch);
        if (acctIndex > -1) {
            Account acct = (Account)accounts.get(acctIndex);
            pl(acct.toString());
        } else {
            pl("Account does not exist.");
        }
    }
}
