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
public class LifeGUI implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private JButton[][] buttons = new JButton[20][20];

    private JButton next;
    
    public LifeGUI() {
        frame = new JFrame("Life");
        panel = new JPanel();
        frame.setContentPane(panel);
        
        for (int i = 0;i<buttons.length;i++) {
            for (int j = 0; j<buttons[i].length;j++) {
                buttons[i][j] = new JButton("0");
                buttons[i][j].setActionCommand(i+”,”+j);
buttons[i][j].addEventListener(this);
panel.add(buttons[i][j]);
                button.setActionCommand(actionCommand);
            }
        }
        
        next = new JButton(“Next”);
        next.setActionCommand(“next”);
next.addEventListener(this);
panel.add(next);
        
        frame.pack();
        frame.setVisible(true);
    }


    func event() {
        if(e.getActionCommand() == “next”) {

        } else {

        }
    }

    private void updateBoard() {
        
    }
}
