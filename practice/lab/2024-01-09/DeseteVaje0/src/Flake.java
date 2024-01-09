import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Flake {
  float x = 0;
  float y = 0;
  int detail = 8;
  int size = 20;
  float counter = 0f;
  float speed=0f;

  public Flake(int x, int y, float speed, int size) {
    this.x = x;
    this.y = y;
    this.size = size;
    this.speed = speed;
  }

  public void fall() {
    if (y > 600) {
      y = -10;
    }
    this.y += speed;
    counter += 0.01;
    float delta = (float) (Math.cos(this.counter+ this.size)); 
    this.x +=  delta;
  }

  public void draw(Graphics g) {
    // draw lines around the center
    Graphics2D g2d = (Graphics2D) g;
    g2d.setColor(new Color(2647295));
    g2d.setStroke(new BasicStroke(3));
    double turn = Math.toRadians(360 / detail);
    for (int i = 1; i < this.detail + 1; i++) {
      g2d.rotate(turn, x, y);
      g2d.drawLine((int) x, (int) y, (int) x + size, (int) y + size);
    }
  }
}
