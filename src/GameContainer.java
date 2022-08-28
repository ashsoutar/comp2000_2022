import java.awt.*;
import java.util.Optional;

public class GameContainer {

Grid grid;
// sets window size
public GameContainer() {
grid = new Grid(720, 720);
}
// sets width and height parameters
public GameContainer(int width, int height) {
grid = new Grid(width, height);
}

// draws outlined mouse position
public void paint(Graphics g, Point mousePos) {
grid.paint(g);
Optional<Cell> cell = grid.cellAtPoint(mousePos);
if (cell.isPresent()) {
grid.GridOutline(g, cell.get());
}
}
}

