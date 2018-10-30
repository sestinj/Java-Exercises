/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3ex9;

/**
 *
 * @author student
 */
public class Calculator {
    private int birthYear;
    private int birthMonth;
    private int birthDay;
    private int currYear;
    private int currMonth;
    private int currDay;
    
    public Calculator(int bYear, int bMonth, int bDay, int cYear, int cMonth, int cDay) {
        this.birthYear = bYear;
        this.birthMonth = bMonth;
        this.birthDay = bDay;
        this.currYear = cYear;
        this.currMonth = cMonth;
        this.currDay = cDay;
    }
    
    public void printOutput() {
        int days = 0;
        days += (currYear-birthYear)*365;
        days += (currMonth-birthMonth)*30;
        days += (currDay-birthDay);
        
        System.out.println("You have been alive for " + days*24 + " days.");
        System.out.println("You have slept " + days*8 + " hours.");
    }
}
