/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch8ex2;

/**
 *
 * @author student
 */
public class PersonalAcct extends Account {
    public void withdrawal(double amt) {
        super.withdrawal(amt);
        if (super.getBalance()< 100) {
            super.withdrawal(2.0);
        }
    }
    public PersonalAcct(double balance, String name) {
        super(balance, name);
    }
}
