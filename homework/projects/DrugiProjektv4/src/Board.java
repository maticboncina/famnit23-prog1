// automatically imported by InteliJ

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Objects;

public class Board extends JFrame {

    // Class variables
    private JButton[] zgornjiGumbi;
    private JPopupMenu gameMenu;
    JScrollPane scrollPane;
    private JPanel gridPanel;
    private JPopupMenu importExportMenu;
    private JTextField difficultyField;
    private JTextField calculationField;
    private JTextField targetScoreField;
    private JTextField movesRemainingField;
    private JButton[][] gridButtons;
    private String[] importedButtons = new String[0];
    private int velikost;
    private int score;
    private int previous = -1;
    private int current = 0;
    boolean firstInit = true;

    /**
     * Constructor for the Board class. Initializes the game board, sets default configurations,
     * and starts a new game. The size of the board is determined randomly using the Utilities class.
     */
    public Board() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initializeComponents();

        Utilities randomGenerator = new Utilities();
        velikost = randomGenerator.randomSizeGenerator();

        izrisiPolje();
        startNewGame();
    }

    /**
     * Initializes the components of the game board. This includes setting up the game and
     * import/export menus, as well as initializing buttons.
     */
    private void initializeComponents() {
        zgornjiGumbi = new JButton[2];

        initializeGameMenu();
        initializeImportExportMenu();
        initializeButtons();
    }

    /**
     * Initializes the game menu with options to start a new game or exit the current game.
     */
    private void initializeGameMenu() {
        gameMenu = new JPopupMenu("Game Menu");

        JMenuItem newGame = new JMenuItem("New Game");
        newGame.addActionListener(e -> startNewGame());
        gameMenu.add(newGame);

        JMenuItem endGame = new JMenuItem("End Game (Exit)");
        endGame.addActionListener(e -> System.exit(0));
        gameMenu.add(endGame);
    }

    /**
     * Initializes the import/export menu with options to import or export game states.
     */
    private void initializeImportExportMenu() {
        importExportMenu = new JPopupMenu("Import/Export Menu");

        JMenuItem importGame = new JMenuItem("Import Game");
        importGame.addActionListener(e -> importGame());
        importExportMenu.add(importGame);

        JMenuItem exportGame = new JMenuItem("Export Game");
        exportGame.addActionListener(e -> exportGame());
        importExportMenu.add(exportGame);
    }

    /**
     * Initializes the buttons on the game board, including the game menu button,
     * import/export button, and hint button.
     */
    private void initializeButtons() {
        zgornjiGumbi = new JButton[3];
        zgornjiGumbi[0] = new JButton("Game");
        zgornjiGumbi[0].addActionListener(e -> gameMenu.show(zgornjiGumbi[0], 0, zgornjiGumbi[0].getHeight()));

        zgornjiGumbi[1] = new JButton("Import/Export");
        zgornjiGumbi[1].addActionListener(e -> importExportMenu.show(zgornjiGumbi[1], 0, zgornjiGumbi[1].getHeight()));

        zgornjiGumbi[2] = new JButton("Hint");
        zgornjiGumbi[2].addActionListener(e -> showHint());
    }

    /**
     * Draws the playing field of the game. It sets up the menu panel, score panel, main panel,
     * and the grid of buttons representing the game board. The method also manages the layout and
     * visibility of these components.
     */
    public void izrisiPolje() {
        if (gridPanel != null) {
            gridPanel.removeAll();
        } else {
            gridPanel = new JPanel();
        }

        gridPanel.removeAll();

        if(firstInit) {
            // Setup top menu panel
            JPanel meniPanel = new JPanel(new GridLayout(1, 2));
            meniPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

            // tuki je inteliJ reku, da naj replacam navaden for loop z enhacned loopom. Zgleda krajš, ampak ne vem kaj je poanta.
            for (JButton button : zgornjiGumbi) {
                meniPanel.add(button);
            }

            // Nastavi izgled in "obnašalnost" gumbkov
            difficultyField = new JTextField(10);
            difficultyField.setEditable(false);
            calculationField = new JTextField(10);
            calculationField.setEditable(false);
            targetScoreField = new JTextField(10);
            targetScoreField.setEditable(false);
            movesRemainingField = new JTextField(10);
            movesRemainingField.setEditable(false);

            // Setup score panel
            JPanel scorePanel = new JPanel(new GridLayout(4, 2));
            scorePanel.setBorder(new EmptyBorder(10, 10, 10, 10));

            // Nastavi izgled in "obnašalnost" gumbkov
            scorePanel.add(new JLabel("Difficulty:"));
            scorePanel.add(difficultyField);
            scorePanel.add(new JLabel("Current Score:"));
            scorePanel.add(calculationField);
            scorePanel.add(new JLabel("Target Score:"));
            scorePanel.add(targetScoreField);
            scorePanel.add(new JLabel("Moves remaining:"));
            scorePanel.add(movesRemainingField);

            // Setup main panel na JPanelu
            JPanel mainPanel = new JPanel(new BorderLayout());
            mainPanel.add(meniPanel, BorderLayout.NORTH);
            mainPanel.add(scorePanel, BorderLayout.CENTER);
            add(mainPanel, BorderLayout.NORTH);
            firstInit = false;
        }

        gridButtons = new JButton[velikost][velikost];

        if (scrollPane != null) {
            remove(scrollPane);
        }

        gridPanel.setLayout(new GridLayout(velikost, velikost));

        // Popravkjena koda za generiranje panela (prej ni delal novi size on "New Game" trigger)
        Utilities randomGenerator = new Utilities();
        gridButtons = new JButton[velikost][velikost];
        gridPanel = new JPanel(new GridLayout(velikost, velikost));
        int buttonSize = 40;
        ActionListener obPritisku = new obPritisku();

        int count = 0;

        for (int i = 0; i < velikost; i++) {
            for (int j = 0; j < velikost; j++) {
                String textOfButton = randomGenerator.randomNumberGenerator();

                if(importedButtons.length > 0) {
                    String parts[] = importedButtons[count].split(",");
                    count++;

                    String text = parts[0];

                    if(text.equals("disabled")) textOfButton = "";
                    else textOfButton = text;

                }

                JButton newButton = new JButton(textOfButton);
                if(textOfButton.isEmpty()) newButton.setEnabled(false);
                newButton.setPreferredSize(new Dimension(buttonSize, buttonSize));
                newButton.addActionListener(obPritisku);
                newButton.setBackground(null);
                gridButtons[i][j] = newButton;
                gridPanel.add(newButton);
            }
        }

        if(importedButtons.length > 0) importedButtons = new String[0];

        // Znebi se grdega scroll panela in tiny 2px scrolla
        scrollPane = new JScrollPane(gridPanel);
        scrollPane.setPreferredSize(new Dimension(velikost * buttonSize + 10, velikost * buttonSize + 10));
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        add(scrollPane, BorderLayout.CENTER);

        // Refresh the frame in vse ostalo živo in mrtvo
        revalidate();
        repaint();
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * Starts a new game by displaying a dialog to choose the game's difficulty.
     * Players can select from predefined difficulty levels or set a custom difficulty.
     */
    private void startNewGame() {

        // Inicializiraj popup za izbiro difficultija
        JDialog difficultyDialog = new JDialog(this, "Choose Difficulty", true);
        difficultyDialog.setLayout(new BorderLayout());
        difficultyDialog.setSize(360, 360);
        difficultyDialog.setLocationRelativeTo(this);

        // Za foro, dodamo image-e ker sem se hotel naučit. Probably also a bad idea, da je image v src direktoriju...
        JLabel imageLabel = new JLabel(new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/1.png"))));
        difficultyDialog.add(imageLabel, BorderLayout.CENTER);
        JPanel difficultyPanel = new JPanel();

        // Array gumbekov
        String[] difficulties = {"Easy", "Medium", "Hard", "Custom"};

        // Zanka, ki ustvari gumbe za izbiro težavnosti in vsakemu gumbu dodeli actionListener, ki sproži metodo handleDifficultySelection z ustrezno težavnostjo ter zapre pogovorno okno po pritisku.
        for (String difficulty : difficulties) { // enako tukaj je inteliJ spet replacal navaden forloop z enhanced.
            JButton difficultyButton = new JButton(difficulty);
            difficultyButton.addActionListener(e -> {
                handleDifficultySelection(difficulty);
                difficultyDialog.dispose();
            });
            difficultyPanel.add(difficultyButton);
        }

        // Pokaži difficultyDialog
        difficultyDialog.add(difficultyPanel, BorderLayout.SOUTH);
        difficultyDialog.setVisible(true);
    }


    /**
     * Handles the selection of game difficulty. Based on the selected difficulty,
     * it triggers the respective difficulty handling method.
     *
     * @param difficulty The chosen difficulty level as a String.
     *                   It can be "Easy", "Medium", "Hard", or "Custom".
     */
    public void handleDifficultySelection(String difficulty) {
        if ("Easy".equals(difficulty)) {
            handleEasyDifficulty();
        } else if ("Medium".equals(difficulty)) {
            handleMediumDifficulty();
        } else if ("Hard".equals(difficulty)) {
            handleHardDifficulty();
        }
         else if ("Custom".equals(difficulty)) {
         handleCustomDifficulty();
         }
    }

    /**
     * Resets the game board to its initial state. It resets the score, reinitializes the grid with
     * new random numbers, and updates the UI components to reflect the reset.
     */
    private void resetBoard() {
        score = 0; // Reset score
        Utilities randomGenerator = new Utilities();

        // pre-preparations. Ob novem zagonu igre moramo vse pobrisat
        scrollPane.remove(gridPanel);
        gridPanel.setLayout(new GridLayout(velikost, velikost));
        gridPanel.removeAll();

        gridButtons = new JButton[velikost][velikost];

        for (int i = 0; i < velikost; i++) {
            for (int j = 0; j < velikost; j++) {
                gridButtons[i][j] = new JButton();
                gridButtons[i][j].setEnabled(true); // Enable the button
                gridButtons[i][j].setText(randomGenerator.randomNumberGenerator()); // Reset with new random number
                gridButtons[i][j].setBackground(null); // Reset the background color
                gridPanel.add(gridButtons[i][j]);
            }
        }

        // ko smo naredili čistko, pa lahko pe enkrat vse namečemo gor
        scrollPane.add(gridPanel);
        izrisiPolje();
        setVisible(true);
    }

    /**
     * Sets up the game board for 'Easy' difficulty. It randomizes the size of the grid, resets the board,
     * and sets specific parameters for the easy difficulty level, such as target score and moves remaining.
     */

    // Easy: Target: 100 - 250. Število potez je 1/2 targetScora
    private void handleEasyDifficulty() {
        velikost = (int)(Math.random() * 10 + 10);
        resetBoard();
        difficultyField.setText("Easy");
        calculationField.setText("0");
        Utilities targetScore = new Utilities();
        String difficulty = targetScore.difficultyGenerator(100, 250);
        targetScoreField.setText(difficulty);
        String movesRemaining = Integer.toString(Integer.parseInt(difficulty) / 2); // parsamo v string in pol nazaj, ker je v buttonsih string za računanje pa rabimo int ampak pol da spet zapišemo, moramo spet met String. Enako pri vseh ostalih trdnostih igre.
        movesRemainingField.setText(movesRemaining);
        lockCustomFields();
    }

    /**
     * Sets up the game board for 'Medium' difficulty. It randomizes the size of the grid, resets the board,
     * and sets specific parameters for the easy difficulty level, such as target score and moves remaining.
     */

    // Medium: Target: 250 - 500. Število potez je 1/4 targetScora
    private void handleMediumDifficulty() {
        velikost = (int)(Math.random() * 10 + 10);
        resetBoard();
        difficultyField.setText("Medium");
        calculationField.setText("0");
        Utilities targetScore = new Utilities();
        String difficulty = targetScore.difficultyGenerator(250, 500);
        targetScoreField.setText(difficulty);
        String movesRemaining = Integer.toString(Integer.parseInt(difficulty) / 4);
        movesRemainingField.setText(movesRemaining);
        lockCustomFields();
    }

    /**
     * Sets up the game board for 'Hard' difficulty. It randomizes the size of the grid, resets the board,
     * and sets specific parameters for the easy difficulty level, such as target score and moves remaining.
     */

    // Medium: Target: 500 - 750. Število potez je 1/8 targetScora
    private void handleHardDifficulty() {
        velikost = (int)(Math.random() * 10 + 10);
        resetBoard();
        difficultyField.setText("Hard");
        calculationField.setText("0");
        Utilities targetScore = new Utilities();
        String difficulty = targetScore.difficultyGenerator(500, 750);
        targetScoreField.setText(difficulty);
        String movesRemaining = Integer.toString(Integer.parseInt(difficulty) / 8);
        movesRemainingField.setText(movesRemaining);
        lockCustomFields();
    }

    /**
     * Locks the custom fields to prevent editing. This is used after setting the difficulty level to
     * ensure that the target score and moves remaining fields are not editable during the game.
     */
    private void lockCustomFields() {
        targetScoreField.setEditable(false);
        movesRemainingField.setEditable(false);
    }

    /**
     * Handles setting up a custom difficulty level. Opens a dialog for the player to input custom settings
     * like target score, moves remaining, and grid size. Validates the input and starts the game with the
     * custom settings if valid.
     */
    private void handleCustomDifficulty() {

        // naredimo še en popup za vpis custom vrednosti
        JDialog customDifficultyDialog = new JDialog(this, "Custom Difficulty", true);
        customDifficultyDialog.setLayout(new GridLayout(4, 2, 10, 10));
        customDifficultyDialog.setSize(300, 200);
        customDifficultyDialog.setLocationRelativeTo(this);

        // Validiramo input integer, da se ropotija ne zakolje (StackOverflow code)
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

        // Add fields and labels for target score
        JLabel targetScoreLabel = new JLabel("Target Score:");
        targetScoreLabel.setBorder(new EmptyBorder(10, 10, 10, 10));
        customDifficultyDialog.add(targetScoreLabel);

        JTextField customTargetScoreField = new JTextField(10);
        customTargetScoreField.setBorder(new EmptyBorder(10, 10, 10, 10));
        customTargetScoreField.setInputVerifier(integerVerifier);
        customDifficultyDialog.add(customTargetScoreField);

        // Add fields and labels for moves remaining (copy pašta)
        JLabel movesRemainingLabel = new JLabel("Moves Remaining:");
        movesRemainingLabel.setBorder(new EmptyBorder(10, 10, 10, 10));
        customDifficultyDialog.add(movesRemainingLabel);

        JTextField customMovesRemainingField = new JTextField(10);
        customMovesRemainingField.setBorder(new EmptyBorder(10, 10, 10, 10));
        customMovesRemainingField.setInputVerifier(integerVerifier);
        customDifficultyDialog.add(customMovesRemainingField);

        // Add fields and labels for custom size (copy pašta)
        JLabel customSizeLabel = new JLabel("Field Size:");
        customSizeLabel.setBorder(new EmptyBorder(10, 10, 10, 10));
        customDifficultyDialog.add(customSizeLabel);

        JTextField customSizeField = new JTextField(10);
        customSizeField.setBorder(new EmptyBorder(10, 10, 10, 10));
        customSizeField.setInputVerifier(integerVerifier);
        customDifficultyDialog.add(customSizeField);

        // Dodamo gumb, ki začne igro. Ta tudi pokliče InoutVerifier metodo od prej in šele potem nastavi. Drugače predpoči.
        JButton startGameButton = new JButton("Start Game");
        startGameButton.addActionListener(e -> {
            if (customTargetScoreField.getInputVerifier().verify(customTargetScoreField) &&
                    customMovesRemainingField.getInputVerifier().verify(customMovesRemainingField) &&
                    customSizeField.getInputVerifier().verify(customSizeField)) {

                targetScoreField.setText(customTargetScoreField.getText());
                movesRemainingField.setText(customMovesRemainingField.getText());
                velikost = Integer.parseInt(customSizeField.getText()); // Set the custom size
                resetBoard();
                difficultyField.setText("Custom");
                calculationField.setText("0");
                lockCustomFields
                        ();
                customDifficultyDialog.dispose();
            } else {
                JOptionPane.showMessageDialog(customDifficultyDialog, "Prosim ne me klat. In vpiši validne integerje za vse fieldse.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Dejansko izrišemo vse
        startGameButton.setBorder(new EmptyBorder(10, 10, 10, 10));
        customDifficultyDialog.add(new JLabel());
        customDifficultyDialog.add(startGameButton);
        customDifficultyDialog.setVisible(true);
    }

    /**
     * Exports the current game state to a file. The method prompts the user to choose a file location and
     * name, then writes the state of the game grid and other relevant information to the selected file.
     */
    private void exportGame() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Choose a file to save the game state. Končninca .txt je dodana avtomatsko.");
        int userSelection = fileChooser.showSaveDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();

            // Zmeraj doda .txt na koncu file-a, zato da se lahko shrani v prailnem formatu ne glede na to kaj uporabnik vnese
            if (!fileToSave.getName().endsWith(".txt")) {
                fileToSave = new File(fileToSave.getAbsolutePath() + ".txt");
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileToSave))) {
                for (int i = 0; i < velikost; i++) {
                    for (int j = 0; j < velikost; j++) {
                        JButton button = gridButtons[i][j];

                        String textOfButton = button.getText();
                        if(button.getText().isEmpty()) textOfButton = "disabled";

                        writer.write(textOfButton + "," + button.isEnabled() + ";");
                    }
                }

                writer.newLine();
                writer.write("Score:" + score + "\n");
                writer.write("MovesRemaining:" + movesRemainingField.getText() + "\n");
                writer.write("Difficulty:" + difficultyField.getText() + "\n");
                writer.write("TargetScore:" + targetScoreField.getText() + "\n");
                writer.write("Previous:" + previous + "\n");
                writer.write("Current:" + current + "\n");
                writer.write("Size:" + velikost + "\n");
            }
            // ujamemo vse napake in rečemo, da pač ropotija ne dela.
            catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error exporting game: " + e.getMessage(), "Export Error. Nekaj me je zaklalo.", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    /**
     * Imports a game state from a file. The method prompts the user to select a file and then reads
     * the game state from that file, updating the game board and other settings accordingly.
     */
    private void importGame() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Za import, izberi datoteko (funny translation 'datoteka'imo), ki vsebuje export igre");
        int userSelection = fileChooser.showOpenDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToLoad = fileChooser.getSelectedFile();

            SwingUtilities.invokeLater(() -> {
                try (BufferedReader reader = new BufferedReader(new FileReader(fileToLoad))) {
                    String line;
                    int count = 0;
                    resetBoard();

                    while ((line = reader.readLine()) != null) {
                        if (line.contains(":")) {
                            // Keyvaklue parser
                            String[] keyValue = line.split(":");
                            switch (keyValue[0]) {
                                case "Score":
                                    score = Integer.parseInt(keyValue[1]);
                                    calculationField.setText(keyValue[1]);
                                    break;
                                case "MovesRemaining":
                                    movesRemainingField.setText(keyValue[1]);
                                    break;
                                case "Difficulty":
                                    difficultyField.setText(keyValue[1]);
                                    break;
                                case "TargetScore":
                                    targetScoreField.setText(keyValue[1]);
                                    break;
                                case "Previous":
                                    previous = Integer.parseInt(keyValue[1]);
                                    break;
                                case "Current":
                                    current = Integer.parseInt(keyValue[1]);
                                    break;
                                case "Size":
                                    velikost = Integer.parseInt(keyValue[1]);
                                    break;
                            }
                        } else {
                            // Board state separator (true/false)
                            String[] cells = line.split(";");
                            importedButtons = new String[cells.length];

                            for (int col = 0; col < cells.length; col++) {
                                importedButtons[count] = cells[col];
                                count++;
                            }
                        }
                    }
                    // Ponovno izriši igralno polje
                    izrisiPolje();
                    revalidate();
                    repaint();
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(this, "Error importing game: " + e.getMessage(), "Import Error Nekaj me je zaklalo.", JOptionPane.ERROR_MESSAGE);
                }
                importHelper();
            });
        }
    }

    /**
     * Provides a hint to the player by highlighting a button on the game board. The method calculates
     * which button to suggest based on the current game state and target score.
     */

    // kako "hint" deluje. Preprosto. Če je razlika med currentScore in targetScore > 9 ti predlaga izbiro največjega gumbeka.
    // če pa ne, pa najde največjega da ne bi šel čez na trenutni potezi.
    // če ni moćnosti ti pove, da se boš zaklal
    private void showHint() {
        int targetScore = Integer.parseInt(targetScoreField.getText());
        int currentScore = Integer.parseInt(calculationField.getText());
        int scoreDifference = Math.abs(targetScore - currentScore);

        JButton bestButton = null;

        if (scoreDifference > 9) {
            // Find the highest number button
            int highestValue = 0;
            for (int i = 0; i < velikost; i++) {
                for (int j = 0; j < velikost; j++) {
                    JButton button = gridButtons[i][j];
                    if (button.isEnabled()) {
                        int buttonValue = Integer.parseInt(button.getText());
                        if (buttonValue > highestValue) {
                            highestValue = buttonValue;
                            bestButton = button;
                        }
                    }
                }
            }
        } else {
            // Edge case, če 9 ni available
            for (int neededScore = scoreDifference; neededScore > 0; neededScore--) {
                for (int i = 0; i < velikost; i++) {
                    for (int j = 0; j < velikost; j++) {
                        JButton button = gridButtons[i][j];
                        if (button.isEnabled()) {
                            int buttonValue = Integer.parseInt(button.getText());
                            if (buttonValue == neededScore) {
                                bestButton = button;
                                break;
                            }
                        }
                    }
                    if (bestButton != null) break;
                }
                if (bestButton != null) break;
            }
        }

        if (bestButton != null) {
            highlightButton(bestButton);
        } else {
            // Pokaži sporočilo, da se boš zaklal no matter what.
            JOptionPane.showMessageDialog(null, "Nimam idej. Maybe zaradi game overja, remija or ali drugega problema. Ali po slovensko 'You are (probably) royally screwed, win is not possible' :(");
        }
    }


    /**
     * Highlights a given button on the game board. This is used to visually indicate a suggested move to
     * the player, typically called from the showHint() method.
     *
     * @param button The JButton to be highlighted.
     */
    private void highlightButton(JButton button) {
        // vedno resetiraj prej highlightane gumbeke
        for (int i = 0; i < velikost; i++) {
            for (int j = 0; j < velikost; j++) {
                gridButtons[i][j].setBorder(null);
            }
        }
        // Highlight predlagan gumbek z borderjem
        button.setBorder(BorderFactory.createLineBorder(Color.GREEN, 3));
    }


    /**
     * Defines the action to be performed when a button on the game grid is pressed. This action includes
     * disabling the button, updating the game score, and performing any necessary game logic based on
     * the button press.
     */
    class obPritisku implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton clickedButton = (JButton) e.getSource();
            if (!clickedButton.isEnabled()) {
                System.out.println("The button is disabled.");
                // to se dejansko zdej nikoli ne zgodi, ampak je blo useful for debugging. Oz. se ne bi smelo nikoli zgoditi.
            } else {
                System.out.println();
                clickedButton.setEnabled(false);
                clickedButton.setBackground(Color.black);

                // Dodaj vrednost iz gumbeka na totalScore
                score += Integer.parseInt(clickedButton.getText());

                // Update field z scoretom
                calculationField.setText(Integer.toString(score));

                mehanizacija(clickedButton);

                // Sprazni gumbek (ki ga tudi disabla)
                clickedButton.setText("");

                // Zmanjšaj moves remaining za 1
                int movesRemaining = Integer.parseInt(movesRemainingField.getText()) - 1;
                movesRemainingField.setText(Integer.toString(movesRemaining));
                checkGameOver();

                clearButtonHighlights(); // zbriši highlighte po opravljeni potezi, če so slučajno bili uporabljeni.
            }
        }
    }

    /**
     * Clears any highlights from buttons on the game board. Typically called to reset the state of the
     * board after a hint has been used or a new move has been made.
     */
    private void clearButtonHighlights() {
        for (int i = 0; i < velikost; i++) {
            for (int j = 0; j < velikost; j++) {
                gridButtons[i][j].setBorder(UIManager.getBorder("Button.border"));
            }
        }
    }

    /**
     * Manages game logic related to the current and previous button presses. It updates the game state
     * based on these values and modifies the enabled state of buttons accordingly.
     *
     * @param text The JButton that was pressed.
     */

    // to je cela reč, ki handla katere gumbeke lahko klikaš
    public void mehanizacija(JButton text) {
        // little naughty cupcake :)
        previous = current;

        if (previous == 0){
            try {
                current = Integer.parseInt(text.getText());
            } catch (NumberFormatException e) {
                current = 1; // Defaultamo na 1 da preventamo deljenje z 0
            }
            text.setText("");

            // intelij enhanced forloops
            for (JButton[] gridButton : gridButtons) {
                for (JButton jButton : gridButton) {
                    if (!jButton.getText().isEmpty()) {
                        jButton.setEnabled(true);
                    }
                }
            }

            if (current != 0) {
                for (int i = 0; i < gridButtons.length; i++) {
                    for (int j = 0; j < gridButtons[i].length; j++) {
                        if (!((i + 1) % current == 0 && (j + 1) % current == 0)) {
                            gridButtons[i][j].setEnabled(false);
                        }
                    }
                }
            }
            // used for debugging
            System.out.println("Current: "+current + " - " + "Previous: " + previous);

        }
        else {
            try {
                current = Integer.parseInt(text.getText());
            } catch (NumberFormatException e) {
                current = 1; // Defaultamo na 1 da preventamo deljenje z 0
            }
            text.setText("");

            // vklopi vse gumbe razen praznih
            // intelij enhanced for loops
            for (JButton[] gridButton : gridButtons) {
                for (JButton jButton : gridButton) {
                    if (!jButton.getText().isEmpty()) {
                        jButton.setEnabled(true);
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
            // used for debugging
            System.out.println("Current: "+current + " - " + "Previous: " + previous);
        }
    }

    /**
     * To je totalno nova funckcija, ki totalno ni rezultat moje kreativnosti in totalno ni modified mehanizacija, ampak kar doseže je to, da lahko igro importamo kadarkoli želimo ne samo preden začnemo igrati. To zdaj negira prejšnji komentar v importu in zdaj vse lepo dela in vsi smo sreči volk ceu in koza sita.
     */
    public void importHelper() {
        // little naughty cupcake :)

        if (previous == 0){
            // intelij enhanced for loops
            for (JButton[] gridButton : gridButtons) {
                for (JButton jButton : gridButton) {
                    if (!jButton.getText().isEmpty()) {
                        jButton.setEnabled(true);
                    }
                }
            }

            if (current != 0) {
                for (int i = 0; i < gridButtons.length; i++) {
                    for (int j = 0; j < gridButtons[i].length; j++) {
                        if (!((i + 1) % current == 0 && (j + 1) % current == 0)) {
                            gridButtons[i][j].setEnabled(false);
                        }
                    }
                }
            }
        }
        else {

            // vklopi vse gumbe razen praznih
            // intelij enhanced for loops
            for (JButton[] gridButton : gridButtons) {
                for (JButton jButton : gridButton) {
                    if (!jButton.getText().isEmpty()) {
                        jButton.setEnabled(true);
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
        }
    }

    /**
     * Checks the game's end conditions, such as reaching the target score, exhausting all moves,
     * or having no more enabled buttons on the board. It displays appropriate messages and terminates
     * the game if any end condition is met.
     */
    private void checkGameOver() {
        // Preveri ali je igre konec (tako da so vsi gumbi disabled)
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
        int currentScore = Integer.parseInt(calculationField.getText());
        int targetScore = Integer.parseInt(targetScoreField.getText());

        // Pregled, če je uporabnik zmagal (targetScore == currentScore)
        if (currentScore == targetScore) {
            JOptionPane.showMessageDialog(this, "Bravo, zmagal si! Ali po slovensko 'Congratulations, you won!' :)");
            System.exit(0); // Close the game on OK press
        }

        // Ker nism zloben, sem naredil, da če je currentScore do 9+ od targetScora je draw
        if (currentScore > targetScore && currentScore <= targetScore + 9) {
            JOptionPane.showMessageDialog(this, "It's a draw! Noben se ni glih zaklal ampak se je schrodinger zaklal :)");
            System.exit(0); // Close the game on OK press
        }

        // Ponovno preveri za gameover (če si šel za več kot 9 čez targetScore
        boolean scoreTooHigh = currentScore > targetScore + 9;
        if (allButtonsDisabled || scoreTooHigh) {
            JOptionPane.showMessageDialog(this, "Game Over! Zaklal si se :)");
            System.exit(0); // Close the game on OK press
        }

        // Dodaten gameover scenarij, ki ti pove, odmik od končne vrednosti, če ti je zmanjkalo potez (če si šel za več kot 9 čez targetScore
        if (noMoreMoves) {
            int scoreDifference = Math.abs(currentScore - targetScore);
            String message = String.format("Game Over! Zaklal si se. Odmik od končne vrednosti je %d točk.", scoreDifference);
            JOptionPane.showMessageDialog(this, message);
            System.exit(0);
        }
    }
    /**
     * The main method that launches the game. It initializes the Board class in the Swing Event
     * Dispatch Thread for thread safety.
     *
     * @param args Command-line arguments (not used in this application).
     */
        public static void main(String[] args) {
        SwingUtilities.invokeLater(Board::new);
    }
        //https://img.maticboncina.si/BDR7rDmdbNJtRJN7FJfZ --> razlog za Board::new - Blame InteliJ
}
