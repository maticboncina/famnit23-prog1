import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class Board extends JFrame {
    private JButton[] zgornjiGumbi;
    private JPopupMenu gameMenu;
    private JPanel gridPanel;
    private JPopupMenu importExportMenu;
    private JTextField difficultyField;
    private JTextField calculationField;
    private JTextField targetScoreField;
    private JTextField movesRemainingField;

    private JButton[][] gridButtons;
    private int velikost;

    private int score;



    public Board() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initializeComponents();
        izrisiPolje();
        startNewGame();
    }

    private void initializeComponents() {
        zgornjiGumbi = new JButton[2];

        initializeGameMenu();
        initializeImportExportMenu();
        initializeButtons();
    }

    private void initializeGameMenu() {
        gameMenu = new JPopupMenu("Game Menu");

        JMenuItem newGame = new JMenuItem("New Game");
        gameMenu.add(newGame);

        JMenuItem endGame = new JMenuItem("End Game (Exit)");
        gameMenu.add(endGame);
    }

    private void initializeImportExportMenu() {
        importExportMenu = new JPopupMenu("Import/Export Menu");


    }

    private void initializeButtons() {
        zgornjiGumbi[0] = new JButton("Game");

        zgornjiGumbi[1] = new JButton("Import/Export");
    }

    public void izrisiPolje() {
        if (gridPanel != null) {
            gridPanel.removeAll();
        } else {
            gridPanel = new JPanel(); // Initialize it here
        }

        gridPanel.removeAll();

        // Setup top menu panel
        JPanel meniPanel = new JPanel(new GridLayout(1, 2));
        meniPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        for (JButton button : zgornjiGumbi) {
            meniPanel.add(button);
        }

        Utilities randomGenerator = new Utilities();
        velikost = randomGenerator.randomSizeGenerator();
        gridButtons = new JButton[velikost][velikost];
        gridPanel.setLayout(new GridLayout(velikost, velikost));

        // Setup score panel
        JPanel scorePanel = new JPanel(new GridLayout(4, 2));
        scorePanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        difficultyField = new JTextField(10);
        difficultyField.setEditable(false);
        calculationField = new JTextField(10);
        calculationField.setEditable(false);
        targetScoreField = new JTextField(10);
        targetScoreField.setEditable(false);
        movesRemainingField = new JTextField(10);
        movesRemainingField.setEditable(false);

        scorePanel.add(new JLabel("Difficulty:"));
        scorePanel.add(difficultyField);
        scorePanel.add(new JLabel("Current Score:"));
        scorePanel.add(calculationField);
        scorePanel.add(new JLabel("Target Score:"));
        scorePanel.add(targetScoreField);
        scorePanel.add(new JLabel("Moves remaining:"));
        scorePanel.add(movesRemainingField);

        // New code for generating the board
        velikost = randomGenerator.randomSizeGenerator();
        gridButtons = new JButton[velikost][velikost];
        JPanel gridPanel = new JPanel(new GridLayout(velikost, velikost));
        int buttonSize = 40;

        for (int i = 0; i < velikost; i++) {
            for (int j = 0; j < velikost; j++) {
                JButton newButton = new JButton(randomGenerator.randomNumberGenerator());
                newButton.setPreferredSize(new Dimension(buttonSize, buttonSize));
                newButton.setBackground(null);
                gridButtons[i][j] = newButton;
                gridPanel.add(newButton);
            }
        }

        // Setup main panel
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(meniPanel, BorderLayout.NORTH);
        mainPanel.add(scorePanel, BorderLayout.CENTER);
        add(mainPanel, BorderLayout.NORTH);

        // Add grid panel with scroll pane

        JScrollPane scrollPane = new JScrollPane(gridPanel);
        scrollPane.setPreferredSize(new Dimension(velikost * buttonSize + 10, velikost * buttonSize + 10));
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        add(scrollPane, BorderLayout.CENTER);

        // Refresh the frame
        revalidate();
        repaint();
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void startNewGame() {
        JDialog difficultyDialog = new JDialog(this, "Choose Difficulty", true);
        difficultyDialog.setLayout(new BorderLayout());
        difficultyDialog.setSize(360, 360);
        difficultyDialog.setLocationRelativeTo(this);

        JLabel imageLabel = new JLabel(new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/1.png"))));
        difficultyDialog.add(imageLabel, BorderLayout.CENTER);

        JPanel difficultyPanel = new JPanel();
        String[] difficulties = {"Easy", "Medium", "Hard", "Custom"};
        for (int i = 0; i < difficulties.length; i++) {
            String difficulty = difficulties[i];
            JButton difficultyButton = new JButton(difficulty);
                difficultyDialog.dispose();
            });
            difficultyPanel.add(difficultyButton);
        }

        // custom difficulty v nova vrstica
        difficultyDialog.add(difficultyPanel, BorderLayout.SOUTH);
        difficultyDialog.setVisible(true);
    }


        if ("Easy".equals(difficulty)) {
        } else if ("Medium".equals(difficulty)) {
        } else if ("Hard".equals(difficulty)) {
        }
         else if ("Custom".equals(difficulty)) {
         }
    }

        score = 0; // Reset score
        Utilities randomGenerator = new Utilities();

        for (int i = 0; i < velikost; i++) {
            for (int j = 0; j < velikost; j++) {
                gridButtons[i][j].setEnabled(true); // Enable the button
                gridButtons[i][j].setText(randomGenerator.randomNumberGenerator()); // Reset with new random number
                gridButtons[i][j].setBackground(null); // Reset the background color
            }
        }
    }

        difficultyField.setText("Easy");
        calculationField.setText("0");
        Utilities targetScore = new Utilities();
        String difficulty = targetScore.difficultyGenerator(100, 250);
        targetScoreField.setText(difficulty);
        String movesRemaining = Integer.toString(Integer.parseInt(difficulty) / 2);
        movesRemainingField.setText(movesRemaining);
    }

        difficultyField.setText("Medium");
        calculationField.setText("0");
        Utilities targetScore = new Utilities();
        String difficulty = targetScore.difficultyGenerator(250, 500);
        targetScoreField.setText(difficulty);
        String movesRemaining = Integer.toString(Integer.parseInt(difficulty) / 4);
        movesRemainingField.setText(movesRemaining);
    }

        difficultyField.setText("Hard");
        calculationField.setText("0");
        Utilities targetScore = new Utilities();
        String difficulty = targetScore.difficultyGenerator(500, 750);
        targetScoreField.setText(difficulty);
        String movesRemaining = Integer.toString(Integer.parseInt(difficulty) / 8);
        movesRemainingField.setText(movesRemaining);
    }

        targetScoreField.setEditable(false);
        movesRemainingField.setEditable(false);
    }

    private boolean isValidInput(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

        JDialog customDifficultyDialog = new JDialog(this, "Custom Difficulty", true);
        customDifficultyDialog.setLayout(new GridLayout(3, 2, 10, 10));
        customDifficultyDialog.setSize(300, 150);
        customDifficultyDialog.setLocationRelativeTo(this);

        // Create an InputVerifier for integer validation
        InputVerifier integerVerifier = new InputVerifier() {
            @Override
            public boolean verify(JComponent input) {
                JTextField tf = (JTextField) input;
                try {
                    Integer.parseInt(tf.getText());
                    return true; // Input is valid
                } catch (NumberFormatException e) {
                    return false; // Input is invalid
                }
            }
        };

        // Add fields and labels for target score and moves remaining
        JLabel targetScoreLabel = new JLabel("Target Score:");
        targetScoreLabel.setBorder(new EmptyBorder(10, 10, 10, 10));
        customDifficultyDialog.add(targetScoreLabel);

        JTextField customTargetScoreField = new JTextField(10);
        customTargetScoreField.setBorder(new EmptyBorder(10, 10, 10, 10));
        customTargetScoreField.setInputVerifier(integerVerifier);
        customDifficultyDialog.add(customTargetScoreField);

        JLabel movesRemainingLabel = new JLabel("Moves Remaining:");
        movesRemainingLabel.setBorder(new EmptyBorder(10, 10, 10, 10));
        customDifficultyDialog.add(movesRemainingLabel);

        JTextField customMovesRemainingField = new JTextField(10);
        customMovesRemainingField.setBorder(new EmptyBorder(10, 10, 10, 10));
        customMovesRemainingField.setInputVerifier(integerVerifier);
        customDifficultyDialog.add(customMovesRemainingField);

        // Add a button to start game
        JButton startGameButton = new JButton("Start Game");
            if (customTargetScoreField.getInputVerifier().verify(customTargetScoreField) &&
                    customMovesRemainingField.getInputVerifier().verify(customMovesRemainingField)) {
                // Set the values from the custom fields to the main fields
                targetScoreField.setText(customTargetScoreField.getText());
                movesRemainingField.setText(customMovesRemainingField.getText());
                difficultyField.setText("Custom");
                calculationField.setText("0");
                customDifficultyDialog.dispose();
            } else {
                JOptionPane.showMessageDialog(customDifficultyDialog, "Please enter valid integer values for both fields.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        startGameButton.setBorder(new EmptyBorder(10, 10, 10, 10));
        customDifficultyDialog.add(new JLabel()); // Placeholder for layout
        customDifficultyDialog.add(startGameButton);

        customDifficultyDialog.setVisible(true);
    }


        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose a file to save the game state");
        int userSelection = fileChooser.showSaveDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();

            if (!fileToSave.getName().endsWith(".txt")) {
                fileToSave = new File(fileToSave.getAbsolutePath() + ".txt");
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileToSave))) {
                for (int i = 0; i < velikost; i++) {
                    for (int j = 0; j < velikost; j++) {
                        JButton button = gridButtons[i][j];
                        writer.write(button.getText() + "," + button.isEnabled() + ";");
                    }
                    writer.newLine();
                }

                writer.write("Score:" + score + "\n");
                writer.write("MovesRemaining:" + movesRemainingField.getText() + "\n");
                writer.write("Difficulty:" + difficultyField.getText() + "\n");
                writer.write("TargetScore:" + targetScoreField.getText() + "\n");
                writer.write("Previous:" + previous + "\n");
                writer.write("Current:" + current + "\n");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error exporting game: " + e.getMessage(), "Export Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select a file to import the game state");
        int userSelection = fileChooser.showOpenDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToLoad = fileChooser.getSelectedFile();

            SwingUtilities.invokeLater(() -> {
                try (BufferedReader reader = new BufferedReader(new FileReader(fileToLoad))) {
                    String line;
                    int row = 0;

                    // Resetting the game state
                    for (int i = 0; i < velikost; i++) {
                        for (int j = 0; j < velikost; j++) {
                            gridButtons[i][j].setText("");
                            gridButtons[i][j].setEnabled(true);
                        }
                    }
                    score = 0;
                    previous = -1;
                    current = 0;

                    while ((line = reader.readLine()) != null) {
                        if (row < velikost) {
                            String[] buttonsInfo = line.split(";");
                            for (int j = 0; j < buttonsInfo.length; j++) {
                                String[] buttonInfo = buttonsInfo[j].split(",");
                                gridButtons[row][j].setText(buttonInfo[0]);
                                gridButtons[row][j].setEnabled(Boolean.parseBoolean(buttonInfo[1]));
                            }
                            row++;
                        } else {
                            String[] parts = line.split(":");
                            switch (parts[0]) {
                                case "Score":
                                    score = Integer.parseInt(parts[1]);
                                    calculationField.setText(String.valueOf(score));
                                    break;
                                case "MovesRemaining":
                                    movesRemainingField.setText(parts[1]);
                                    break;
                                case "Difficulty":
                                    difficultyField.setText(parts[1]);
                                    break;
                                case "TargetScore":
                                    targetScoreField.setText(parts[1]);
                                    break;
                                case "Previous":
                                    previous = Integer.parseInt(parts[1]);
                                    break;
                                case "Current":
                                    current = Integer.parseInt(parts[1]);
                                    break;
                            }
                        }
                    }
                    // Refresh the frame to reflect changes
                    revalidate();
                    repaint();
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(this, "Error importing game: " + e.getMessage(), "Import Error", JOptionPane.ERROR_MESSAGE);
                }
            });
        }
    }



    // Action pičke
        public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            if (!clickedButton.isEnabled()) {
                System.out.println("The button is disabled.");
            } else {
                System.out.println("");
                clickedButton.setEnabled(false);
                clickedButton.setBackground(Color.black);

                // Add the value from the button to the score
                score += Integer.parseInt(clickedButton.getText());

                // Update the calculationField with the new score
                calculationField.setText(Integer.toString(score));

                // Clear the text of the clicked button
                clickedButton.setText("");

                // Decrement moves remaining by 1
                int movesRemaining = Integer.parseInt(movesRemainingField.getText()) - 1;
                movesRemainingField.setText(Integer.toString(movesRemaining));
            }
        }
    }

    private int previous = -1;
    private int current = 0;

        // update previous pa current
        previous = current;

        // Update current
        try {
            current = Integer.parseInt(text.getText());
        } catch (NumberFormatException e) {
            current = 1; // Defaultamo na 1 da preventamo deljenje z 0
        }
        text.setText("");

        // vklopi vse gumbe razen praznih
        for (int i = 0; i < gridButtons.length; i++) {
            for (int j = 0; j < gridButtons[i].length; j++) {
                if (!gridButtons[i][j].getText().equals("")) {
                    gridButtons[i][j].setEnabled(true);
                }
            }
        }

        if (current != 0 && previous != 0) {
            for (int i = 0; i < gridButtons.length; i++) {
                for (int j = 0; j < gridButtons[i].length; j++) {
                    if (!((i + 1) % current == 0 && (j + 1) % current == 0) &&
                            !((i + 1) % previous == 0 && (j + 1) % previous == 0)) {
                        gridButtons[i][j].setEnabled(false);
                    }
                }
            }
        }
        System.out.println(current + " " + previous);
    }

        // Existing checks for game over
        boolean allButtonsDisabled = true;
        for (int i = 0; i < velikost; i++) {
            for (int j = 0; j < velikost; j++) {
                if (gridButtons[i][j].isEnabled()) {
                    allButtonsDisabled = false;
                    break;
                }
            }
        }
        boolean noMoreMoves = Integer.parseInt(movesRemainingField.getText()) <= 0;

        // Get current score and target score
        int currentScore = Integer.parseInt(calculationField.getText());
        int targetScore = Integer.parseInt(targetScoreField.getText());

        // Check for exact win condition
        if (currentScore == targetScore) {
            JOptionPane.showMessageDialog(this, "Bravo, zmagal si! Ali po slovensko 'Congratulations, you won!' :)");
            System.exit(0); // Close the game on OK press
        }

        // Check for draw condition
        if (currentScore > targetScore && currentScore <= targetScore + 9) {
            JOptionPane.showMessageDialog(this, "It's a draw! Noben se ni glih zaklal :)");
            System.exit(0); // Close the game on OK press
        }

// Check for game over condition
        boolean scoreTooHigh = currentScore > targetScore + 9;
        if (allButtonsDisabled || scoreTooHigh) {
            JOptionPane.showMessageDialog(this, "Game Over! Zaklal si se :)");
            System.exit(0); // Close the game on OK press
        }

        if (noMoreMoves) {
            int scoreDifference = Math.abs(currentScore - targetScore);
            String message = String.format("Game Over! Zaklal si se. Odmik od končne vrednosti je %d točk.", scoreDifference);
            JOptionPane.showMessageDialog(this, message);
            System.exit(0);
        }
    }




    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Board());
    }
}

