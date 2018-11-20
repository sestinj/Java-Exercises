/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadc;

/**
 *
 * @author natesesti
 */
public class CADC {

    /**
     * @param args the command line arguments
     */
    
    static void runGUI() {
        ODCA odca = new ODCA();
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
