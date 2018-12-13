package craps;
import java.awt.event.*;
import javax.swing.*;

// Represents a control panel for a craps "table"

public class ControlPanel extends JPanel
    implements ActionListener
{
  private CrapsTable table;
  public JLabel playerLabel;
  public JLabel scoreLabel;

  // Constructor
  public ControlPanel(CrapsTable t)
  {
    table = t;
    table.control = this;
    
    playerLabel = new JLabel("Player 1");
    add(playerLabel);
    
    JButton rollButton = new JButton("Roll");
    rollButton.setActionCommand("Roll");
    rollButton.addActionListener(this);
    add(rollButton);
    
    JButton holdButton = new JButton("Score");
    holdButton.setActionCommand("Score");
    holdButton.addActionListener(this);
    add(holdButton);
    
    scoreLabel = new JLabel("Score: 0");
    add(scoreLabel);
  }

  // Called when the roll button is clicked
  public void actionPerformed(ActionEvent e)
  {
    if (!table.diceAreRolling()) {
        if (e.getActionCommand() == "Roll") {
            table.rollDice();
        } else {
            table.holdDice();
        }
    }
  }
}
