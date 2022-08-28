import javax.swing.*;
import java.awt.*;

class Main extends JFrame {

public static void main(String[] args) throws Exception {
Main window = new Main();
window.run();
}

private Main() {
App canvas = new App();
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setContentPane(canvas);
this.pack();
this.setVisible(true);
}

public void run() throws Exception {
while (true) {
this.repaint();
}
}

class App extends JPanel {

GameContainer gameContainer;

public App() {
setPreferredSize(new Dimension(720, 720));
gameContainer = new GameContainer();
}

@Override
public void paint(Graphics g) {
gameContainer.paint(g, getMousePosition());
}

}
}

/*
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {
    class Canvas extends JPanel {
      Grid grid = new Grid();
      public Canvas() {
        setPreferredSize(new Dimension(720, 720));
      }

      @Override
      public void paint(Graphics g) {
        grid.paint(g, getMousePosition());
      }
    }

    private Main() {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Canvas canvas = new Canvas();
      this.setContentPane(canvas);
      this.pack();
      this.setVisible(true);
    }

    public static void main(String[] args) throws Exception {
      Main window = new Main();
      window.run();
    }

    public void run() {
      while(true) {
        repaint();
      }
    }
}
*/
