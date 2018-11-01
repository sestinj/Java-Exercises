/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10ex2;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.*;
import java.lang.Integer;
/**
 *
 * @author student
 */
public class TTT implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    private JButton[] buttons;
    private String turn = "O";
    public TTT() {
        frame = new JFrame("Tic Tac Toe");
        panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        frame.setContentPane(panel);
        buttons = new JButton[9];
        for (int i = 0;i<9;i++) {
            buttons[i] = new JButton("");
            buttons[i].addActionListener(this);
            buttons[i].setActionCommand(""+i);
            
            panel.add(buttons[i]);
        }
        frame.setVisible(true);
        frame.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int index = Integer.parseInt(e.getActionCommand());
        JButton button = buttons[index];
        if (button.getText() == "") {
            button.setText(turn);
            //Check for three in a row
            if (winner()) {
                JLabel label = new JLabel(turn + "'s win!");
                panel.add(label);
                for (JButton theButton:buttons) {
                    panel.remove(theButton);
                }
                frame.pack();
            } else {
                //Check for cat
                Boolean isCat = true;
                for (JButton butt: buttons) {
                    if (butt.getText() == "") {
                        isCat = false;
                    }
                }
                if (isCat) {
                    JLabel label = new JLabel("CAT!");
                    panel.add(label);
                    for (JButton theButton:buttons) {
                        panel.remove(theButton);
                    }
                frame.pack();
                }
            }
            if (turn == "O") {
                turn = "X";
            } else {
                turn = "O";
            }
        }
    }
    private Boolean winner() {
        Boolean winner = false;
        //Rows
        for (int row = 0;row < 3;row++) {
            if (buttons[row*3].getText().equals(turn) && buttons[row*3+1].getText().equals(turn) && buttons[row*3+2].getText().equals(turn)) {
                winner = true;
            }
        }
        //Columns
        for (int col = 0;col<3;col++) {
            if (buttons[col].getText().equals(turn) && buttons[col+3].getText().equals(turn) && buttons[col+6].getText().equals(turn)) {
                winner = true;
            }
        }
        if (buttons[4].getText().equals(turn)) {
            if ((buttons[0].getText().equals(turn) && buttons[8].getText().equals(turn)) || (buttons[6].getText().equals(turn) && buttons[2].getText().equals(turn))) {
                winner = true;
            }
        }
        return winner;
    }
}
