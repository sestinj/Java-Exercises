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
import java.lang.Integer;
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
        
        next = new JButton("Next");
        next.setActionCommand("next");
        next.addActionListener(this);
        panel.add(next);
        
        for (int i = 0;i<buttons.length;i++) {
            for (int j = 0; j<buttons[i].length;j++) {
                buttons[i][j] = new JButton("0");
                buttons[i][j].setActionCommand("" + i + "," + j);
                buttons[i][j].addActionListener(this);
                panel.add(buttons[i][j]);
            }
        }
        
        frame.pack();
        frame.setVisible(true);
    }



    private void updateBoard() {
        for (int i = 0;i<buttons.length;i++) {
            for (int j = 0;j < buttons[i].length;j++) {
                if (isAlive(i, j)) {
                    if (!(numNeighbors(i, j) == 2 || numNeighbors(i, j) == 3)) {
                        setButton(i, j, false);
                    }
                } else {
                    if (numNeighbors(i, j) == 3) {
                        setButton(i, j, true);
                    }
                }
            }
        }
    }
    private void setButton(int i, int j, boolean alive) {
        if (alive) {
            buttons[i][j].setText("X");
        } else {
            buttons[i][j].setText("0");
        }
    }
    private boolean isAlive(int i, int j) {
        if ("X".equals(buttons[i][j].getText())) {
            return true;
        } else {
            return false;
        }
    }
    private int numNeighbors(int i, int j) {
        int[] iIndices = {-1, 0, 1, -1, 1, -1, 0, 1};
        int[] jIndices = {-1, -1, -1, 0, 0, 1, 1, 1};
        int num = 0;
        for (int k = 0;k<iIndices.length;k++) {
            int newI = i + iIndices[k];
            int newJ = j + jIndices[k];
            if (newI >= 0 && newI < buttons.length && newJ >= 0 && newJ < buttons.length) {
                if (isAlive(newI, newJ)) {
                    num ++;
                }
            }
        }
        return num;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String ac = e.getActionCommand();
        if(ac == "next") {
            updateBoard();
        } else {
            int i;
            i = Integer.parseInt(ac.split(",")[0]);
            int j;
            j = Integer.parseInt(ac.split(",")[1]);
            buttons[i][j].setText("X");
        }
    }
}
