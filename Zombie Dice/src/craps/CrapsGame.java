package craps;

// Implements the game of Craps logic

public class CrapsGame
{
  

  /**
   *  Calculates the result of the next dice roll in the Craps game.
   *  The parameter total is the sum of dots on two dice.
   *  point is set to the saved total, if the game continues,
   *  or 0, if the game has ended.
   *  Returns 1 if player won, -1 if player lost,
   *  0 if player continues rolling.
   */
  public int processRoll(DiceState[] states, CrapsTable table)
  {
    current = players[currentTurn-1];
    for (DiceState state:states) {
        if (state == DiceState.brain) {
            current.addBrains(1);
        } else if (state == DiceState.shotgun) {
            current.addShotguns(1);
        } else {
            current.addRunners(1);
        }
    }
    table.display.update(-1, current.getNumBrains(), current.getNumShotguns(), current.getNumRunners());
    if (current.getNumShotguns() >= 3) {
        this.current.clearBrains();
        this.nextTurn(table);
        return -1;
    } else {
        return 0;
    }
  }
  
  private Player[] players;
  public CrapsGame(int numPlayers) {
      this.players = new Player[numPlayers];
      for (int i = 0;i<numPlayers;i++) {
          this.players[i] = new Player(i+1);
      }
      current = this.players[0];
  }
  private int currentTurn = 1;
  public Player current;
  public void nextTurn(CrapsTable table) {
      current.endTurn();
      
      currentTurn ++;
      if (currentTurn > players.length) {
          currentTurn = 1;
      }
      current = players[currentTurn-1];
      table.display.update(-1, current.getNumBrains(), current.getNumShotguns(), current.getNumRunners());
      table.control.playerLabel.setText("Player " + currentTurn);
      table.control.scoreLabel.setText("Score: " + current.getScore());
  }
}
