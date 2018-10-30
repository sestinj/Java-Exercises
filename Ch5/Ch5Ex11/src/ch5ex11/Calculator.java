/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch5ex11;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Calculator {
    private int start;
    private String m;
    private int hrs;
    public void setValues() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the starting hour: ");
        start = input.nextInt();
        System.out.print("Enter am or pm: ");
        m = input.next();
        System.out.print("Enter the number of elapsed hours: ");
        hrs = input.nextInt();
    }
    public void printTime() {
        for (int i = 0;i<hrs;i++) {
            start ++;
            if (start > 12) {
                start = 1;
                if (m == "pm") {
                    m = "am";
                } else {
                    m = "pm";
                }
            }
        }
        
        System.out.println("The time is: " + start + ":00" + m);
    }
}
