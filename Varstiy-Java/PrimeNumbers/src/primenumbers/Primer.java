/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumbers;
import java.util.Scanner;
/**
 *
 * @author natesesti
 */
public class Primer {
    
    public void run() {
        Scanner input = new Scanner(System.in);
        boolean stillGoing = true;
        while (stillGoing) {
            System.out.print("Enter a positive integer: ");
            int num = input.nextInt();
            System.out.println(getAnswer(num));
        }
    }
    private String getAnswer(int n) {
        if (isPrime(n)) {
            if (isPrime(flip(n))) {
                return n + " is an emirp.";
            } else {
                return n + " is a prime.";
            }
        } else {
            return n + " is not prime.";
        }
    }
    private int flip(int n) {
        return n;
    }
    private boolean isPrime(int n) {
        for (int i = 2;i<n;i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
