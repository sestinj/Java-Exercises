/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadc;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author natesesti
 */
public class ODCA implements ActionListener {
    JFrame frame;
    JPanel panel;
    JButton stepFor;
    JButton stepBack;
    JButton forward;
    JButton back;
    JButton reset;
    JButton pause;
    Canvas canvas;
    Graphics g;
    
    private int size = 400;
    private int currentRow = 0;
    //RULE:            111,   110,  101,   100,  000,   001,   010,   011
    boolean[] rule = {false, true, false, true, false, false, false, true};
    boolean running = false;
    private boolean[][] cells = new boolean[size][size];
    
    public ODCA() {
        this.frame = new JFrame("CADC");
        this.panel = new JPanel();
        frame.setContentPane(panel);
        
        stepFor = new JButton("+");
        stepFor.addActionListener(this);
        stepFor.setActionCommand("+");
        panel.add(stepFor);
        
        stepBack = new JButton("-");
        stepBack.addActionListener(this);
        stepBack.setActionCommand("-");
        panel.add(stepBack);
        
        forward = new JButton("++>");
        forward.setActionCommand("++>");
        forward.addActionListener(this);
        panel.add(forward);
        
        back = new JButton("<--");
        back.setActionCommand("<--");
        back.addActionListener(this);
        panel.add(back);
        
        reset = new JButton("Reset");
        reset.setActionCommand("Reset");
        reset.addActionListener(this);
        panel.add(reset);
        
        pause = new JButton("Pause");
        pause.setActionCommand("Pause");
        pause.addActionListener(this);
        panel.add(pause);
        
        canvas = new Canvas();
        canvas.setSize(size, size);
        frame.add(canvas);
        
        frame.pack();
        frame.setVisible(true);
        
        g = canvas.getGraphics();
        
        //Initial state
        for (int i = 0;i<cells.length;i++) {
            for (int j = 0;j<cells[i].length;j++) {
                cells[i][j] = false;
            }
        }
        cells[0][200] = true;
        this.update();
    }

    private void update() {
        //clear();
        for (int i = 0;i<cells.length;i++) {
            for (int j = 0;j<cells[i].length;j++) {
                this.drawSquare(j, i, cells[i][j]);
            }
        }
    }
    private void drawSquare(int x, int y, boolean on) {
        g.setColor(Color.WHITE);
        if (on) {g.setColor(Color.BLACK);}
        g.drawRect(x, y, 0, 0);
    }
    private void randomInit(int row) {
        for (int i = 0;i<size;i++) {
            cells[row][i] = false;
            if(Math.random()<0.05){cells[row][i] = true;}
        }
    }
    private void clear() {
        g.clearRect(0, 0, canvas.getSize().width, canvas.getSize().height);
    }
    private void increment() {
        if (currentRow>=399) {
            this.frame.dispose();
            return;
        }
        for (int i = 1;i<size-1;i++) {
            boolean left = cells[currentRow][i-1];
            boolean right = cells[currentRow][i+1];
            boolean self = cells[currentRow][i];
            boolean newColor;
            if (left) {
                if (right) {
                    if (self) {
                        newColor = false;
                    } else {
                        newColor = true;
                    }
                } else {
                    if (self) {
                        newColor = false;
                    } else {
                        newColor = true;
                    }
                }
            } else {
                if (right) {
                    if (self) {
                        newColor = false;
                    } else {
                        newColor = true;
                    }
                } else {
                    if (self) {
                        newColor = false;
                    } else {
                        newColor = false;
                    }
                }
            }
            cells[currentRow+1][i] = newColor;
        }
        currentRow ++;
        update();
    }
    private void decrement() {
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Reset":
                clear();
                break;
            case "+":
                increment();
                break;
            case "-":
                decrement();
                break;
            case "++>":
                running = true;
                do {
                    increment();
                } while (running);
                break;
            case "<--":
                running = true;
                do {
                    decrement();
                } while(running);
                break;
            case "Pause":
                running = false;
        }
    }

}

