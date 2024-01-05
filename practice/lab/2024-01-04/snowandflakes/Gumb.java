import javax.swing.*;
import java.awt.*;

public class Gumb extends JButton {
    protected void paintComponent(Graphics g){
        g.setColor(Color.pink);
        g.fillRect(5, 6, 50, 70);
        g.setColor(Color.red);
        g.fillOval(100, 100, 200, 300);
        g.fillOval(230, 150, 100, 200);
        g.fillOval(90, 250, 100, 200);
        g.fillOval(200, 250, 100, 200);
        g.setColor(Color.gray);
        g.fillOval(90, 150, 120, 50);
    }

}
