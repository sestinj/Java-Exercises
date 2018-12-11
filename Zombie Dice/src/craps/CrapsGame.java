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
  public int processRoll(DiceState[] states)
  {
    for (DiceState state:states) {
        if (state == DiceState.brain) {
            numBrains ++;
        } else if (state == DiceState.shotgun) {
            numShotguns ++;
        } else {
            numRunners ++;
        }
    }
    if (numShotguns >= 3) {
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
  }
  private int currentTurn = 1;
  public void nextTurn(CrapsTable table) {
      currentTurn ++;
      if (currentTurn > players.length) {
          currentTurn = 1;
      }
      Player current = players[currentTurn-1];
      table.display.update(-1, current.getNumBrains(), current.getNumShotguns(), current.getNumShotguns());
  }
  private int numBrains;
  public int getNumBrains() {
      return numBrains;
  }
  private int numShotguns;
  public int getNumShotguns() {
      return numShotguns;
  }
  private int numRunners;
  public int getNumRunners() {
      return numRunners;
  }
}
