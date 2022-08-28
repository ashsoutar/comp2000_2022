import java.awt.*;

class Cell extends Rectangle {

static int size = 35;
GameTile tile;

public Cell(int x, int y, GameTile tile) {
  super(x, y, size, size);
  this.tile = tile;
}

// Draw the tile
void paint(Graphics g) {
tile.paint(g, this);
g.setColor(Color.WHITE);
}
public void paint(Graphics g, Point mousePos) {
    if(contains(mousePos)) {
      g.setColor(Color.GRAY);
    } else {
      g.setColor(Color.WHITE);
    }
    g.fillRect(x, y, size, size);
    g.setColor(Color.BLACK);
    g.drawRect(x, y, size, size);
  }

    public boolean contains(Point p) {
    if(p != null) {
      return x < p.x && x+size > p.x && y < p.y && y+size > p.y;
    } else {
      return false;
    }
}
}

