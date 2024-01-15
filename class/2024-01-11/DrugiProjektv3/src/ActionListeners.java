public class ActionListeners {
import java.awt.event.ActionListener;
        newGame.addActionListener(e -> startNewGame());
        endGame.addActionListener(e -> System.exit(0));
        zgornjiGumbi[0].addActionListener(e -> gameMenu.show(zgornjiGumbi[0], 0, zgornjiGumbi[0].getHeight()));
        zgornjiGumbi[1].addActionListener(e -> importExportMenu.show(zgornjiGumbi[1], 0, zgornjiGumbi[1].getHeight()));
        ActionListener obPritisku = new obPritisku(); // Make sure this listener is defined
                newButton.addActionListener(obPritisku);
            difficultyButton.addActionListener(e -> {
        startGameButton.addActionListener(e -> {
    class obPritisku implements ActionListener {
}
