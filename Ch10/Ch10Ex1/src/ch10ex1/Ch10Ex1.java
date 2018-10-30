/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10ex1;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author student
 */
public class Ch10Ex1 implements ActionListener {
    JFrame frame;
    JPanel panel;
    JButton deposit;
    JButton withdrawal;
    JButton checkBal;
    JButton add;
    JButton remove;
    JTextField textField;
    /**
     * @param args the command line arguments
     */
    public Ch10Ex1() {
        frame = new JFrame("Local Bank");
        panel = new JPanel();
        frame.setContentPane(panel);
        deposit = new JButton("Deposit");
        deposit.setActionCommand("deposit");
        deposit.addActionListener(this);
        withdrawal = new JButton("Withdrawal");
        withdrawal.setActionCommand("withdrawal");
        withdrawal.addActionListener(this);
        checkBal = new JButton("Check Balance");
        checkBal.setActionCommand("checkBal");
        checkBal.addActionListener(this);
        add = new JButton("Add Account");
        add.setActionCommand("add");
        add.addActionListener(this);
        remove = new JButton("Remove Account");
        remove.setActionCommand("remove");
        remove.addActionListener(this);
        textField = new JTextField("-----", 20);
        textField.addActionListener(this);
        textField.setActionCommand("textField");
        textField.setVisible(false);
        panel.add(deposit);
        panel.add(withdrawal);
        panel.add(checkBal);
        panel.add(add);
        panel.add(remove);
        panel.add(textField);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    private static void runGUI() {
        Ch10Ex1 gui = new Ch10Ex1();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Bank bank = new Bank();
        String acctID;
        Double amt;
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                runGUI();
            }
        });
        
        
        
        
    }
    String currentAction = "None";
    Account currentAccount;
    @Override
    public void actionPerformed(ActionEvent e) {
        this.currentAction = e.getActionCommand();
        switch (e.getActionCommand()) {
            case "withdrawal":
                break;
            case "deposit":
                break;
            case "checkBal":
                break;
            case "add":
                textField.setVisible(true);
                textField.setText("Enter your name.");
                frame.pack();
                break;
            case "remove":
                break;
            case "textField":
                switch (e.getActionCommand()) {
                    case "withdrawal":
                        
                        break;
                    case "deposit":
                        break;
                    case "checkBal":
                        break;
                    case "add":
                        textField.setVisible(false);
                        break;
                    case "remove":
                        break;
                    case "textField":
                }
                break;
        }
    }
    
}
