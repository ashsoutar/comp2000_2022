import java.awt.*;
import java.util.Optional;

public class GameContainer {

Grid grid;
// Default constructor sets default sizes
public GameContainer() {
grid = new Grid(720, 720);
}

public GameContainer(int width, int height) {
grid = new Grid(width, height);
}

// Draws the grid on the JPanel and mouse position highlight
public void paint(Graphics g, Point mousePos) {
grid.paint(g);
Optional<Cell> cell = grid.cellAtPoint(mousePos);
if (cell.isPresent()) {
grid.paintHover(g, cell.get());
}
}
}

