import javax.swing.*;
import java.awt.*;

public class Okno1 extends JFrame {
    Okno1(){
        JButton gumb = new JButton("Prvi gumb");
        JButton gumb1 = new JButton("Še en gumb");
        JButton gumb2 = new JButton("Še en gumb");
        JLabel napis = new JLabel("Dober dan");

        JPanel sredina = new JPanel();
        sredina.setLayout(new GridLayout(3,4));
        JButton gumbi[][] = new JButton[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                gumbi[i][j] = new JButton(i+"-"+j);
                sredina.add(gumbi[i][j]);
            }
        }

        add(BorderLayout.NORTH, gumb);
        add(BorderLayout.SOUTH, gumb1);
        add(BorderLayout.EAST, gumb2);
        add(BorderLayout.WEST, napis);
        add(BorderLayout.CENTER, sredina);

        setVisible(true);
        setSize(700,700);
    }
    public static void main(String[] args) {
        Okno1 oo = new Okno1();
    }
}
