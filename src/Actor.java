import java.awt.Color;
import java.awt.Graphics;

public abstract class Actor {
  Color color;
  Cell loc;

  public void paint(Graphics g) {
    g.setColor(color);
    g.fillRect(loc.x , loc.y, loc.x - 10, loc.y - 10);
    g.setColor(Color.GRAY);
    g.drawRect(loc.x, loc.y, loc.x - 10, loc.y -10);
  }
}

