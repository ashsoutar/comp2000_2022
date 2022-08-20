import java.awt.Graphics;
import java.awt.Point;

public class Stage {
  Grid grid;
  Stone grass;
  Stone water;
  Stone sand;

  public Stage() {
    grid = new Grid();
    grass = new Grass(grid.cellAtColRow(0, 0));
    water = new Water(grid.cellAtColRow(0, 15));
    sand = new Sand(grid.cellAtColRow(12, 9));
  }

  public void paint(Graphics g, Point mouseLoc) {
    grid.paint(g, mouseLoc);
    grass.paint(g);
    water.paint(g);
    sand.paint(g);
  }
}
