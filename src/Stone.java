import java.awt.Color;
import java.awt.Graphics;

public abstract class Stone {
  Color color;
  Cell loc;

  public void paint(Graphics g) {
    g.setColor(color);
    g.fillRect(loc.x + 5, loc.y + 5, loc.x - 10, loc.y - 10);
    g.setColor(Color.GRAY);
    g.drawRect(loc.x + 5, loc.y + 5, loc.x - 10, loc.y - 10);
  }
}

