package craps;
import java.awt.event.*;
import javax.swing.*;

// Represents a control panel for a craps "table"

public class ControlPanel extends JPanel
    implements ActionListener
{
  private CrapsTable table;

  // Constructor
  public ControlPanel(CrapsTable t)
  {
    table = t;
    JButton rollButton = new JButton("Roll");
    rollButton.setActionCommand("Roll");
    rollButton.addActionListener(this);
    add(rollButton);
    
    JButton holdButton = new JButton("Hold");
    holdButton.setActionCommand("Hold");
    holdButton.addActionListener(this);
    add(holdButton);
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
