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
    
    //RULE: 111, 110, 101, 100, 000, 001, 010, 011
    int x = 0b01010101;
    boolean running = false;
    ArrayList<ArrayList<Boolean>> cells = new ArrayList<ArrayList<Boolean>>();
    
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
        canvas.setSize(400, 400);
        frame.add(canvas);
        
        frame.pack();
        frame.setVisible(true);
        
        g = canvas.getGraphics();
    }

    
    private void drawSquare(int x, int y, int on) {
        g.setColor(Color.WHITE);
        if (on==1) {g.setColor(Color.BLACK);}
        g.drawRect(x, y, 1, 1);
    }
    
    private void clear() {
        g.clearRect(0, 0, canvas.getSize().width, canvas.getSize().height);
    }
    private void increment() {
        
    }
    private void decrement() {
        
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Reset":
                randomInit();
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

