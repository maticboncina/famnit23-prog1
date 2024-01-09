import javax.swing.*;
import java.awt.*;

public class Gumb extends JButton {
    protected void paintComponent(Graphics g){
        g.fillRect(6,8, 50, 90);
        g.setColor(Color.pink);
        g.fillOval(50, 70, 100, 120);
    }
}
