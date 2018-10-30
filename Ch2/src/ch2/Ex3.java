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
public class Ex3 {
    public static void main(String[] args) {
        // TODO code application logic here
        p("***************");
       for (int i=1;i<=5;i++) {
           p("*             *");
       }
       p("***************");
    }
    public static void p(String txt) {
        System.out.println(txt);
    }
}
