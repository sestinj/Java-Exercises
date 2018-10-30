/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9ex6;

/**
 *
 * @author student
 */
public class LockerOpener {
    private boolean[] lockers = new boolean[100];
    
    public void run() {
        for (int i = 0;i<100;i++) {
            lockers[i] = true;
        }
        for (int j = 2;j<=100;j++) {
            for (int i = j-1;i<100;i+=j) {
                lockers[i] = !lockers[i];
            }
        }
        
        for (boolean isOpen:lockers) {
            if (isOpen) {
                System.out.println("OPEN");
                
            } else {
                System.out.println("CLOSED");
            }
        }
    }
}
