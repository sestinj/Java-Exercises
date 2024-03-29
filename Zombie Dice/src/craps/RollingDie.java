// Implements a rolling die object.
package craps;
import java.awt.*;
import javax.swing.*;
import javax.imageio.*;
import java.awt.image.*;
import java.io.*;

public class RollingDie extends Die implements ImageObserver
{
  private static final double slowdown = 0.97,
                              speedFactor = 0.032,
                              speedLimit = 0.5;

  private static int tableLeft, tableRight, tableTop, tableBottom;

  private final int dieSize = 24;
  private int xCenter, yCenter;
  private double xSpeed, ySpeed;

  // sets the "table" boundaries
  public static void setBounds(int left, int right, int top, int bottom)
  {
    tableLeft = left;
    tableRight = right;
    tableTop = top;
    tableBottom = bottom;
  }

  // Constructor: sets this die "off the table"
  public RollingDie(Color color) {
    super(color);
    xCenter = -1;
    yCenter = -1;
  }

  // Starts this die rolling
  public void roll()
  {
    super.randomizeState();
    int width = tableRight - tableLeft;
    int height = tableBottom - tableTop;
    xCenter = tableLeft;
    yCenter = tableTop + height / 2;
    xSpeed = width * (Math.random() + 1) * speedFactor;
    ySpeed = height * (Math.random() -.5) * 2. * speedFactor;
  }

  // Returns true if this die is rolling; otherwise
  // returns false
  public boolean isRolling()
  {
    return xSpeed > speedLimit || xSpeed < -speedLimit
        || ySpeed > speedLimit || ySpeed < -speedLimit;
  }

  // Keeps moving this die as long as it overlaps
  // with other
  public void avoidCollision(RollingDie other)
  {
    if (other == this)
      return;

    while (Math.abs(xCenter - other.xCenter) < dieSize &&
           Math.abs(yCenter - other.yCenter) < dieSize)
      move();
  }

  // Moves this die on the "table," bouncing
  // off the edges when necessary
  private void move()
  {
    xCenter += xSpeed;
    yCenter += ySpeed;

    int radius = dieSize / 2;

    if (xCenter < tableLeft + radius)
    {
      xCenter = tableLeft + radius;
      xSpeed = -xSpeed;
    }

    if (xCenter > tableRight - radius)
    {
      xCenter = tableRight - radius;
      xSpeed = -xSpeed;
    }

    if (yCenter < tableTop + radius)
    {
      yCenter = tableTop + radius;
      ySpeed = -ySpeed;
    }

    if (yCenter > tableBottom - radius)
    {
      yCenter = tableBottom - radius;
      ySpeed = -ySpeed;
    }
  }

  // Draws this die, rolling or stopped;
  // also moves this die, when rolling
  public void draw(Graphics g)
  {
    if (xCenter < 0 || yCenter < 0)
      return;
    else if (isRolling())
    {
      move();
      drawRolling(g);
      xSpeed *= slowdown;
      ySpeed *= slowdown;
    }
    else
    {
      drawStopped(g);
    }
  }

  // Draws this die when rolling with a random number of dots
  private void drawRolling(Graphics g)
  {
    
    int x = xCenter - dieSize / 2 + (int)(3 * Math.random()) - 1;
    int y = yCenter - dieSize / 2 + (int)(3 * Math.random()) - 1;
    g.setColor(this.getColor());

    if (x % 2 != 0)
      g.fillRoundRect(x, y, dieSize, dieSize, dieSize/4, dieSize/4);
    else
      g.fillOval(x - 2, y - 2, dieSize + 4, dieSize + 4);
    drawDots(g, x, y, this.getState());
    this.randomizeState();
  }

  // Draws this die when stopped
  private void drawStopped(Graphics g)
  {
    int x = xCenter - dieSize / 2;
    int y = yCenter - dieSize / 2;
    g.setColor(this.getColor());
    g.fillRoundRect(x, y, dieSize, dieSize, dieSize/4, dieSize/4);
    drawDots(g, x, y, getState());
  }
  // Draws a given number of dots on this die
  private void drawDots(Graphics g, int x, int y, DiceState state)
  {
    g.setColor(this.getColor());
    g.fillRoundRect(x, y, dieSize, dieSize, dieSize/4, dieSize/4);

    Image img;
    if (state == DiceState.brain) {
        img = loadImage("brain.png");
    } else if (state == DiceState.shotgun) {
        img = loadImage("shotgun.png");
    } else {
        img = loadImage("runner.png");
    }
    g.drawImage(img, x, y, this);
  }
  
  private Image loadImage(String name) {
      BufferedImage img = null;
      try {
          img = ImageIO.read(new File(name));
      } catch (IOException e) {
          System.out.println(e.getMessage());
      }
      Image scaledImg = img.getScaledInstance(dieSize, dieSize, 0);
      return scaledImg;
  }

    @Override
    public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
        return true;
    }
}
