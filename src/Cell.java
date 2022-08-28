import java.awt.*;

class Cell extends Rectangle {

static int size = 35;
Tile tile;

public Cell(int x, int y, Tile tile) {
super(x, y, size, size);
this.tile = tile;
}

// Draw the tile
void paint(Graphics g) {
tile.paint(g, this);
}

}


