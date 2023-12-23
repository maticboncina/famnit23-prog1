import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sudoku extends JFrame {
    JButton gumbi[][] = new JButton[9][9];

    Sudoku() {
        PoslusalecPametni psl = new PoslusalecPametni();

        JButton novaIgra = new JButton("Nova igra");
        novaIgra.addActionListener(new Poslusalec());
        JLabel napis = new JLabel("Mega Super Duper igra");

        JPanel sredina = new JPanel();
        JPanel top = new JPanel();
        top.add(napis);
        top.add(novaIgra);

        top.setLayout(new FlowLayout());

        sredina.setLayout(new GridLayout(9, 9));
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                gumbi[i][j] = new JButton("");
                gumbi[i][j].addActionListener(psl);
                sredina.add(gumbi[i][j]);
            }
        }

        add(BorderLayout.NORTH, top);
        add(BorderLayout.CENTER, sredina);

        setVisible(true);
        setSize(600, 600);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Sudoku oo = new Sudoku();
    }

    class Poslusalec implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Zgornji gumb je pritisnjen.");
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    gumbi[i][j].setText("");
                }
            }
        }
    }

    class PoslusalecPametni implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (gumbi[i][j] == e.getSource()) {
                        String tmp = gumbi[i][j].getText();
                        if (tmp.equals("")) {
                            gumbi[i][j].setText("1");
                        } else if (tmp.equals("9")) {
                            gumbi[i][j].setText("");
                        } else {
                            int intTmp = Integer.parseInt(tmp);
                            intTmp++;
                            gumbi[i][j].setText(intTmp + "");
                        }
                    }
                }
            }
            System.out.println("To je nova stvar.");
        }
    }
}
