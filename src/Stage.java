import java.awt.Graphics;
import java.awt.Point;

public class Stage {
  Grid grid;
  Actor grass;
  Actor water;
  Actor sand;
  Actor stone;

  public Stage() {
    grid = new Grid();
    grass = new Grass(grid.cellAtColRow(1, 1));
    water = new Water(grid.cellAtColRow(1, 2));
    sand = new Sand(grid.cellAtColRow(1, 3));
    stone = new Stone(grid.cellAtColRow(1, 4));
  }

  public void paint(Graphics g, Point mouseLoc) {
    grid.paint(g, mouseLoc);
    grass.paint(g);
    water.paint(g);
    sand.paint(g);
    stone.paint(g);
  }
}
