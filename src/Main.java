import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Graphics;
<<<<<<< HEAD
import java.io.IOException;
=======
import java.time.Duration;
import java.time.Instant;
>>>>>>> 7f61c6bbe29ceebbf635a3a8f84832cf905a6c0d

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {
    class Canvas extends JPanel implements MouseListener {
      Stage stage;

      public Canvas() throws IOException {
        setPreferredSize(new Dimension(1024, 720));
        this.addMouseListener(this);
        stage = StageReader.readStage("data/stage1.rvb");
      }

      @Override
      public void paint(Graphics g) {
        stage.paint(g, getMousePosition());
      }

      @Override
      public void mouseClicked(MouseEvent e) {
        stage.mouseClicked(e.getX(), e.getY());
      }

      @Override
      public void mousePressed(MouseEvent e) {}

      @Override
      public void mouseReleased(MouseEvent e) {}

      @Override
      public void mouseEntered(MouseEvent e) {}

      @Override
      public void mouseExited(MouseEvent e) {}
    }

    public static void main(String[] args) throws Exception {
      Main window = new Main();
      window.run();
    }

    private Main() throws IOException {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Canvas canvas = new Canvas();
      this.setContentPane(canvas);
      this.pack();
      this.setVisible(true);
    }

    public void run() {
      while(true) {
        Instant startTime = Instant.now();
        repaint();
        Instant endTime = Instant.now();
        long howLong = Duration.between(startTime, endTime).toMillis();
        try {
          Thread.sleep(20l - howLong);
        } catch(InterruptedException e) {
          System.out.println("thread was interrupted, but who cares?");
        } catch(IllegalArgumentException e) {
          System.out.println("application can't keep up with framerate");
        }
      }
    }
}
