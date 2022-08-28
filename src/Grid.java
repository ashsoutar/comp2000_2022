import java.awt.*;
import java.util.*;

class Grid {
int width, height;
// sets the size of cells in grid
int border = 10,
cellSize = 35, 
cellLength = 20;
int boardSize = cellSize * cellLength;
Cell[][] cells = new Cell[cellLength][cellLength];

public Grid(int width, int height) {
    this.width = width;
    this.height = height;

int random;

GameTile type;
    for (int i = 0; i < cells.length; i++) {
    for (int j = 0; j < cells[i].length; j++) {
    random = (int) (Math.random() * 10); // sets random

// sets coloured tiles 
        switch (random) {
        case 0:
        type = new Sand();
        break;                  
        case 1:
        type = new Stone();
        break;
        case 2:
        type = new Water();
        break;
        case 4:
        type = new Wall();
        break;
        case 3:
        type = new Fence();
        break;
        default:
        type = new Grass();         //fills majority 
        }
        cells[i][j] = new Cell(border + cellSize * i, border + cellSize * j, type);
        }
    }
}

//checks for possible null cell points
public Optional<Cell> cellAtPoint(Point point) {
    if (point == null || !contains(point)) {
        return Optional.empty();
    }

    int x = (point.x - border) / cellSize;
    int y = (point.y - border) / cellSize;

    return Optional.of(cells[x][y]);
    }

//outlines the grid cell on hover
public void GridOutline(Graphics g, Cell cell) {
    g.setColor(Color.GRAY);
    g.drawRect(cell.x + 1, cell.y + 1, cell.height - 2, cell.width - 2);
    g.drawRect(cell.x + 2, cell.y + 2, cell.height - 4, cell.width - 4);
    g.drawRect(cell.x + 3, cell.y + 3, cell.height - 6, cell.width - 6);
}

// draws cells while in grid boundary
public void paint(Graphics g) {
for (int i = 0; i < cells.length; i++) {
    for (int j = 0; j < cells[i].length; j++) {
        cells[i][j].paint(g);
        }
    }
}

public boolean contains(Point point) {
// checks for null and border outlines
    if (point != null && point.x > border && point.y > border && point.x < boardSize + border
    && point.y < boardSize + border) {
        return true;
        }
    return false;
    }
}


