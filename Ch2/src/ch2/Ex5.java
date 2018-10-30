/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch2;

/**
 *
 * @author student
 */
public class Ex5 {
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i=1;i<=3;i++) {
            p("     |       |       ");
        }
        p("--------------------");
        for (int i=1;i<=3;i++) {
            if (i==2) {
                p("     |   X   |       ");
            } else {
                p("     |       |       ");
            }
            
        }
        p("--------------------");
        for (int i=1;i<=3;i++) {
            p("     |       |       ");
        }
    }
    public static void p(String txt) {
        System.out.println(txt);
    }
}
