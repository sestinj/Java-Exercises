/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10ex5;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.*;
import java.lang.Math;
/**
 *
 * @author student
 */
public class LifeGUI {
    private JFrame frame;
    private JPanel panel;
    private JButton[][] buttons = new JButton[20][20];
    
    public LifeGUI() {
        frame = new JFrame("Life");
        panel = new JPanel();
        frame.setContentPane(panel);
        
        for (int i = 0;i<buttons.length;i++)) {
            for (JButton button : buttonsList) {
                button = new JButton("0");
                button.setActionCommand(actionCommand);
            }
        }
        
        
        frame.pack();
        frame.setVisible(true);
    }
}
