/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6ex7;

/**
 *
 * @author natesesti
 */
public class Calculator {
    private boolean isPerfect(int num) {
        int tot = 0;
        for (int i=1;i<num;i++) {
            if (num%i == 0) {
                tot += i;
            }
        }
        if (tot == num) {
            return true;
        } else {
            return false;
        }
    }
    public void run() {
        for (int i=1;i<=100;i++) {
            if (isPerfect(i)) {
                System.out.println(i);
            }
        }
    }
}
