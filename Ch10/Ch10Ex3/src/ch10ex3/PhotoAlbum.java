/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10ex3;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author student
 */
public class PhotoAlbum implements ActionListener {
    private JLabel image;
    private JButton next;
    private JButton prev;
    private JPanel panel;
    private JFrame frame;
    private int index = 0;
    
    public PhotoAlbum() {
        frame = new JFrame("Photo Album");
        panel = new JPanel();
        frame.setContentPane(panel);
        image = new JLabel(new ImageIcon("image_0.jpg"));
        prev = new JButton("<");
        prev.setActionCommand("prev");
        prev.addActionListener(this);
        next = new JButton(">");
        next.setActionCommand("next");
        next.addActionListener(this);
        panel.add(image);
        panel.add(prev);
        panel.add(next);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "prev") {
            index --;
            if (index < 0) {
                index = 4;
            }
        } else if (e.getActionCommand() == "next") {
            index ++;
            if (index > 4) {
                index = 0;
            }
        }
        image.setIcon(new ImageIcon("image_" + index + ".jpg"));
        
    }
}
