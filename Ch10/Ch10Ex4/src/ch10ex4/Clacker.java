/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10ex4;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.*;
import java.lang.Math;
/**
 *
 * @author student
 */
public class Clacker implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JButton sum;
    private JButton num1;
    private JButton num2;
    private JButton roll;
    private JLabel die1;
    private JLabel die2;
    private JLabel numRollsLabel;
    
    private int numRolls = 0;
    private int diceNum1 = 1;
    private int diceNum2 = 1;
    private String[] nums = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
    
    public Clacker() {
        frame = new JFrame("Clacker");
        panel = new JPanel();
        frame.setContentPane(panel);
        
        label = new JLabel("Numbers");
        updateNums();
        panel.add(label);
        
        sum = new JButton("Sum");
        sum.setActionCommand("Sum");
        sum.addActionListener(this);
        panel.add(sum);
        
        num1 = new JButton("num1");
        num1.setActionCommand("num1");
        num1.addActionListener(this);
        panel.add(num1);
        
        num2 = new JButton("num2");
        num2.setActionCommand("num2");
        num2.addActionListener(this);
        panel.add(num2);
        
        roll = new JButton("Roll");
        roll.setActionCommand("roll");
        roll.addActionListener(this);
        panel.add(roll);
        
        die1 = new JLabel(new ImageIcon("die_1.jpg"));
        panel.add(die1);
        
        die2 = new JLabel(new ImageIcon("die_1.jpg"));
        panel.add(die2);
        
        numRollsLabel = new JLabel("0");
        panel.add(numRollsLabel);
        
        frame.pack();
        frame.setVisible(true);
    }
    private void updateNums() {
        label.setText("");
        for (String num:nums) {
            if (!("0".equals(num))) {
                label.setText(label.getText() + "  " + num);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Sum":
                System.out.println(diceNum1 + diceNum2);
                nums[diceNum1 + diceNum2] = "X";
                updateNums();
                break;
            case "num1":
                nums[diceNum1] = "X";
                updateNums();
                break;
            case "num2":
                nums[diceNum2] = "X";
                updateNums();
                break;
            case "roll":
                numRolls ++;
                numRollsLabel.setText("Number of Rolls: " + numRolls);
                diceNum1 = (int)(Math.random()*11+1);
                die1.setIcon(new ImageIcon("die_" + diceNum1 + ".jpg"));
                diceNum2 = (int)(Math.random()*11+1);
                die2.setIcon(new ImageIcon("die_" + diceNum2 + ".jpg"));
                break;
        }
    }
}
