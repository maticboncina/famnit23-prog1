import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    JButton g1, g2;
    Main(){
        g1 = new JButton("Konec");
        g1.addActionListener(new P1());
        g2 = new JButton("16");
        g2.addActionListener(new P2());
        add(BorderLayout.EAST, g1);
        add(BorderLayout.WEST, g2);
        setSize(400, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        Main kk = new Main();
    }

    class P1 implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            System.exit(1);
        }
    }

    class P2 implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String tmp = g2.getText();
            int tmpTmp = Integer.parseInt(tmp);
            if (tmpTmp !=1){
                tmpTmp /= 2;
            }
            g2.setText(tmpTmp + "");
        }
    }

}