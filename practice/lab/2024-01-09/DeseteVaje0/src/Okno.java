import javax.swing.*;

public class Okno extends JFrame {
    Okno(){
        add(new Gumb());
        setSize(200, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        Okno oo = new Okno();
    }

}


