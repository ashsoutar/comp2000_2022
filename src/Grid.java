import java.awt.*;
import java.util.*;

class Grid {

int width, height;
// Default values for border and size of cells
int border = 10, cellSize = 35, dimension = 20;
int boardSize = cellSize * dimension;
Cell[][] cells = new Cell[dimension][dimension];

// Constructor that initialises grid with randomised tiles
public Grid(int width, int height) {
this.width = width;
this.height = height;
int rand;

Tile tileType;
for (int i = 0; i < cells.length; i++) {
for (int j = 0; j < cells[i].length; j++) {
rand = (int) (Math.random() * 10); // New random number for tile selection
// Initialise tile depending on randomised selection
switch (rand) {
case 0:
tileType = new Water();
break;
case 1:
tileType = new Stone();
break;
case 2:
tileType = new Fence();
break;
default:
tileType = new Grass();
break;
case 3:
tileType = new Wall();
break;
case 4:
tileType = new Sand();
}
cells[i][j] = new Cell(border + cellSize * i, border + cellSize * j, tileType);
}
}
}

// Checks whether there is a grid cell at the given Point
public Optional<Cell> cellAtPoint(Point point) {

if (point == null || !contains(point)) {
return Optional.empty();
}

int x = (point.x - border) / cellSize;
int y = (point.y - border) / cellSize;

return Optional.of(cells[x][y]);
}

// Draws the hover outline over a given Cell
public void paintHover(Graphics g, Cell cell) {
g.setColor(Color.GRAY);
g.drawRect(cell.x + 1, cell.y + 1, cell.x - 2, cell.y - 2);
g.drawRect(cell.x + 2, cell.y + 2, cell.x - 4, cell.y - 4);
g.drawRect(cell.x + 3, cell.y + 3, cell.x - 6, cell.y - 6);
}

// Draw the grid on the Jpanel
public void paint(Graphics g) {
for (int i = 0; i < cells.length; i++) {
for (int j = 0; j < cells[i].length; j++) {
cells[i][j].paint(g);
}
}
}

// Returns whether or not the grid contains a given Point
public boolean contains(Point point) {

// Check boundaries of grid area
if (point != null && point.x > border && point.y > border && point.x < boardSize + border
&& point.y < boardSize + border) {
return true;
}
return false;
}
}

