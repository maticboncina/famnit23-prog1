import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CloneableButton extends JButton implements ActionListener {

    JPanel panel;
    int index;

    public CloneableButton(JPanel panel, String label, int index){
        this.panel = panel;
        setText(label);
        this.index = index;
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("Kloniral si "+getText());
        String label = getText();
        Component[] components = panel.getComponents();

        for (int i = 0; i < components.length; i++) {
            if (components[i] == this){
                this.index = i;
            }
        }

        CloneableButton klon = new CloneableButton(panel, label, index + 1);

        panel.add(klon, index+1);
        panel.revalidate();
    }
}
