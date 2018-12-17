/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
/**
 *
 * @author natesesti
 */
public class TestGUI extends JFrame {
    private NodeController controller;
    
    public TestGUI() {
        super("Test");
        controller = new NodeController(100);
        controller.setLayout(new BorderLayout());
        controller.setBorder(new EmptyBorder(0, 5, 0, 5));
        this.setBounds(200, 200, controller.width, controller.height);
        this.setContentPane(controller);
        this.setVisible(true);
    }
}
