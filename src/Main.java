import javax.swing.*;
import java.awt.*;

class Main extends JFrame {

public static void main(String[] args) throws Exception {
Main window = new Main();
window.run();
}

private Main() {
Canvas canvas = new Canvas();
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

class Canvas extends JPanel {

GameContainer gameContainer;


//sets size of window
public Canvas() {
setPreferredSize(new Dimension(720, 720));
gameContainer = new GameContainer();
}

@Override
public void paint(Graphics g) {
gameContainer.paint(g, getMousePosition());
}

}
}

