/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch6ex4;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Drawer {
    private int size;
    public void setSize() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        this.size = input.nextInt();
    }
    public void draw() {
        for (int i = 0;i<size;i++) {
            this.addSpaces(2*size-i);
            this.drawBar(2*i+1);
        }
    }
    public void drawBar(int num) {
        String str = "";
        for (int i = 0;i<num;i++) {
            str += "*";
        }
        System.out.print(str + "\n");
    }
    public void addSpaces(int num) {
        String str = "";
        for (int i = 0;i<num;i++) {
            str += " ";
        }
        System.out.print(str);
    }
}
