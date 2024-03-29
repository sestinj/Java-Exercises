// Represents the craps table with two rolling dice
package craps;
import craps.CrapsGame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class CrapsTable extends JPanel
                        implements ActionListener
{
  private RollingDie[] die;
  private RollingDie die1, die2, die3;
  private final int delay = 20;
  final private Timer clock;
  final private CrapsGame game;
  final public DisplayPanel display;
  public ControlPanel control;

  // Constructor
  private void initDie() {
      die = new RollingDie[13];
        for (int i=0;i<13;i++) {
            if (i<5) {
                die[i] = new RollingDie(Color.RED);
            } else if (i<10) {
                die[i] = new RollingDie(Color.YELLOW);
            } else {
                die[i] = new RollingDie(Color.GREEN);
            }
        }
        randomlySelectDice();
  }
  private void randomlySelectDice() {
    int index1 = (int)(Math.random()*13-1);
    int index2 = (int)(Math.random()*13-1);
    int index3 = (int)(Math.random()*13-1);
    die1 = die[index1];
    die2 = die[index2];
    die3 = die[index3];
  }
  public CrapsTable(DisplayPanel displ)
  {
    initDie();
    setBackground(Color.green.darker().darker());
    setBorder(new LineBorder(Color.ORANGE.darker(), 3));
    display = displ;
    game = new CrapsGame(2);
    
    clock = new Timer(delay, this);
  }

  // Rolls the dice (called when the "Roll" button
  // is clicked)
  public void rollDice()
  {
    RollingDie.setBounds(3, getWidth() - 3, 3, getHeight() - 3);
    randomlySelectDice();
    die1.roll();
    die2.roll();
    die3.roll();
    clock.start();
  }

  // Processes timer events
  public void actionPerformed(ActionEvent e)
  {
    if (diceAreRolling())
    {
      if (!clock.isRunning())
        clock.restart();
      if (die1.isRolling()){
        die1.avoidCollision(die2);
        die1.avoidCollision(die3);
      }if (die2.isRolling()){
        die2.avoidCollision(die1);
        die2.avoidCollision(die3);
      }if (die3.isRolling()){
          die3.avoidCollision(die1);
          die3.avoidCollision(die2);}
    }
    else
    {
      clock.stop();
      DiceState[] states = {die1.getState(), die2.getState(), die3.getState()};
      int result = game.processRoll(states, this);
      //int brains = game.current.getNumBrains();
      //int shotguns = game.current.getNumShotguns();
      //int runners = game.current.getNumRunners();
      //display.update(result, brains, shotguns, runners);
    }

    repaint();
  }

  // returns true if dice are still rolling; otherwise
  // returns false
  public boolean diceAreRolling()
  {
    return die1.isRolling() || die2.isRolling() || die3.isRolling();
  }

  // Called automatically after a repaint request
  @Override
  
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    if (die1 == null){return;}
    die1.draw(g);
    die2.draw(g);
    die3.draw(g);
  }
  
  
  public void holdDice() {
      this.game.nextTurn(this);
  }
}