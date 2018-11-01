/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10ex4;

/**
 *
 * @author student
 */
public class Ch10Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void runGUI() {
        Clacker clacker = new Clacker();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                runGUI();
            }
        });
    }
    
}
