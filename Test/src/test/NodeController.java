/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.LineBorder;
/**
 *
 * @author natesesti
 */
public class NodeController extends JPanel implements ActionListener {
    private final int delay = 100;
    private final double connectionFactor = 0.01;
    public final int width = 800;
    public final int height = 500;
    private final int restingTime = 5;
    private final double randomStimulationFactor = 0.1;
    
    
    ArrayList<Node> nodes;
    
    public NodeController(int n) {
        this.nodes = new ArrayList<Node>();
        this.randomInit(n);
        
        this.setBackground(Color.BLUE.brighter());
        this.setBorder(new LineBorder(Color.black, 1));
        
        Timer timer = new Timer(delay, this);
        timer.setActionCommand("Repaint");
        timer.start();
    }
    
    private void randomInit(int n) {
        for (int i = 0;i<n;i++) {
            Node node = new Node(null, width, height, this);
            nodes.add(node);
        }
        for (Node n1:nodes) {
            for (Node n2:nodes) {
                if (Math.random()<connectionFactor) {
                    n1.addConnection(n2);
                }
            }
        }
        for (Node node : nodes) {
            if (node.getNumConnections() <= 0) {
                int randIdx = (int)(Math.random()*nodes.size());
                node.addConnection(nodes.get(randIdx));
            }
        }
        repaint();
    }
    
    
    private void addConnection(Node from, Node to) {
        from.addConnection(to);
        repaint();
    }
    public ArrayList<Integer> stimulatedConnections = new ArrayList<Integer>();
    private boolean isStart = true;
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        stimulatedConnections.clear();
        if (isStart) {
            isStart = false;
            this.nodes.get(0).isStimulated = true;
        }
        for (Node node:nodes) {
            if (Math.random()<randomStimulationFactor){
                if (Math.random()<0.2) {
                    node.isStimulated = true;
                } else {
                    node.isStimulated = false;
                }
            }
            if (node.isStimulated) {
                if (node.restingNumber == restingTime) {
                    node.restingNumber ++;
                } else {
                    node.stimulateConnections();
                    node.isStimulated = false;
                    node.restingNumber = 0;
                }
            }
        }
        for (Node node:nodes) {
            node.draw(g);
        }
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Repaint":
                repaint();
                break;
        }
    }
}
