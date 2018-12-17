/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
/**
 *
 * @author natesesti
 */
public class Node {
    private int[] pos;
    private ArrayList<Node> connections;public int getNumConnections() {return connections.size();}
    private NodeController controller;
    public boolean isStimulated = false;
    public int restingNumber = 0;
    
    public Node(ArrayList<Node> connections, int width, int height, NodeController controller) {
        this.pos = new int[2];
        this.pos[0] = (int)(Math.random()*width);
        this.pos[1] = (int)(Math.random()*height);
        this.connections = new ArrayList<Node>();
        this.controller = controller;
    }
    public void draw(Graphics g) {
        if (isStimulated) {
            g.setColor(Color.yellow);
            g.fillOval(pos[0]-3, pos[1]-3, 6, 6);
            g.setColor(Color.yellow);
            for (Node node : connections) {
                int x = node.pos[0], y = node.pos[1];
                g.drawLine(this.pos[0], this.pos[1], x, y);
            }
        } else {
            g.setColor(Color.red);
            g.fillOval(pos[0]-3, pos[1]-3, 6, 6);
            for (Node node : connections) {
                g.setColor(Color.black);
                for (Integer integer:controller.stimulatedConnections) {
                    if (integer.intValue() == this.hashCode()*node.hashCode()) {
                        g.setColor(Color.yellow);
                    }
                }
                int x = node.pos[0], y = node.pos[1];
                g.drawLine(this.pos[0], this.pos[1], x, y);
            }
        }
    }
    public void stimulateConnections() {
        for (Node node:connections) {
            node.isStimulated = true;
            controller.stimulatedConnections.add(new Integer(this.hashCode()*node.hashCode()));
        }
    }
    public void addConnection(Node node) {
        connections.add(node);
    }
}
