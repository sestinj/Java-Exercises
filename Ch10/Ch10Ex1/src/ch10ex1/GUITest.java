/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10ex1;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author student
 */
public class GUITest implements ActionListener {
    JButton button;
    JFrame frame;
    JPanel panel;
    int x = 0;
    int y = 0;
    
    public GUITest(int x, int y) {
        this.x = x;
        this.y = y;
        button = new JButton("New Window");
        button.setActionCommand("New");
        button.addActionListener(this);
        frame = new JFrame("Title");
        panel = new JPanel();
        panel.add(button);
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocation(x, y);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "New":
                for (int i = 0;i<1000;i++) {
                    x += 10;
                    if (x > 1300) {
                        x = 0;
                        y += 10;
                    }
                    GUITest guiTest = new GUITest(x, y);
                }
                
                break;
            default:
                break;
        }
    }
}
