import javax.swing.*;
import java.awt.*;

class Main extends JFrame {

public static void main(String[] args) throws Exception {
Main Canvas = new Main();
Canvas.run();
}

private Main() {
Canvas canvas = new Canvas();
this.setContentPane(canvas);
}

public void run() throws Exception {
while (true) {
this.repaint();
}
}

//sets size of window
class Canvas extends JPanel {

public Canvas() {
setPreferredSize(new Dimension(720, 720));
}

@Override
public void paint(Graphics g) {
}

}
}
