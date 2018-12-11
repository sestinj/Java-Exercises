// Represents a display panel for a Craps table
package craps;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class DisplayPanel extends JPanel
{
  private JTextField brainText, shotgunText, runnerText;
  private int brainCount, shotgunCount, runnerCount;

  // Constructor
  public DisplayPanel()
  {
    super(new GridLayout(2, 3, 10, 0));
    setBorder(new EmptyBorder(0, 0, 5, 0));

    add(new JLabel("    Brains:"));
    add(new JLabel("    Shotguns:"));
    add(new JLabel("    Runners:"));

    Font displayFont = new Font("Monospaced", Font.BOLD, 16);

    brainText = new JTextField("  0", 5);
    brainText.setFont(displayFont);
    brainText.setEditable(false);
    brainText.setBackground(Color.WHITE);
    add(brainText);

    shotgunText = new JTextField("  0", 5);
    shotgunText.setFont(displayFont);
    shotgunText.setEditable(false);
    shotgunText.setBackground(Color.WHITE);
    add(shotgunText);

    runnerText = new JTextField(5);
    runnerText.setFont(displayFont);
    runnerText.setEditable(false);
    runnerText.setBackground(Color.WHITE);
    add(runnerText);
  }

  // Updates this display, based on the result and
  // "point" in the previous roll
  public void update(int result, int brains, int shotguns, int runners)
  {
    if (result != 0)
    {
        brainCount = brains;
        shotgunCount = shotguns;
        runnerCount = runners;
        brainText.setText(" " + brainCount);
        shotgunText.setText(" " + shotgunCount);
        runnerText.setText(" " + runnerCount);
    }
    else
    {
      runnerCount = 0;
      shotgunCount = 0;
      shotgunText.setText("");
      runnerText.setText("");
    }
  }
}
