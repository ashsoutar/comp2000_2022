import java.awt.*;

public abstract class GameTile implements Heirarchy {

//outlines the colour, cost and type
Color color;
static int MovementCost;
String type;

// adds colour and type parameters
GameTile() {
}
GameTile(Color color, String type) {
this.color = color;
this.type = type;
}

GameTile(Color color, String type, int MovementCost) {
this.color = color;
this.type = type;
GameTile.MovementCost = MovementCost;
}

public void paint(Graphics g, Cell cell) {
g.setColor(Color.BLACK);
g.drawRect(cell.x, cell.y, cell.width, cell.height);
g.setColor(color);
g.fillRect(1 + cell.x, 1 + cell.y, cell.width - 1, cell.height - 1);
}

}