// Odpri okno z uporabo java swing v ono vstavi n gumbov oštevilčenih od 1 do n
// Ko uporabnik klikne na gumb se gumb podvoji in klon se postavi na desno stran od kloniranega gumba

import javax.swing.*;

public class Main extends JFrame {

    public Main(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Clonable Buttons");

        JPanel panel = new JPanel();

        int n = 10;
        for (int i = 0; i < n; i++) {
            panel.add(new CloneableButton(panel, ""+i, i));
        }

        add(panel);

        setSize(600, 600);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Main();
    }
}