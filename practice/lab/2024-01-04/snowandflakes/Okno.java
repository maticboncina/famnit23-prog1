import javax.swing.*;

public class Okno extends JFrame {
    Okno(){
        add (new Gumb());
        this.setSize(400, 500);
        this.setVisible(true);
    }
    public static void main (String[] args){
        Okno oo= new Okno();
    }
}
