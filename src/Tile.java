import java.awt.*;

public abstract class Tile implements Heirarchy {

Color color;
static int MovementCost;
String type;

// Constructors
Tile() {
}

Tile(Color color, String type) {
this.color = color;
this.type = type;
}

Tile(Color color, String type, int MovementCost) {
this.color = color;
this.type = type;
Tile.MovementCost = MovementCost;
}

public void paint(Graphics g, Cell cell) {
g.setColor(Color.BLACK);
g.drawRect(cell.x, cell.y, cell.width, cell.height);
g.setColor(color);
g.fillRect(1 + cell.x, 1 + cell.y, cell.width - 1, cell.height - 1);
}

}