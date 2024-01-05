import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Snow {
  static Flake flakes[] = new Flake[100];
  public static void main(String[] args) {
      JFrame f = new JFrame();
      Random r = new Random();
     
      for (int i = 0; i < flakes.length; i++) {
        int size = (int)(Math.abs(Math.random()) * 10);
      flakes[i] = new Flake(r.nextInt(800), r.nextInt(600), size , size);
    }
      
      JPanel p = new JPanel() {
          @Override
          protected void paintComponent(Graphics g) {
              super.paintComponent(g);
              g.setColor(Color.BLACK);
              g.fillRect(0, 0, getWidth(), getHeight());
              for (int i = 0; i < flakes.length; i++) {
                flakes[i].fall();
          flakes[i].draw(g);
        }
              try {
          Thread.sleep(20);
        } catch (InterruptedException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
              super.repaint();
          }
      };
      f.add(p);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setSize(800, 600);
      f.setVisible(true);
  }
}

