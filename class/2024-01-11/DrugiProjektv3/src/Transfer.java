public class Transfer {
        JMenuItem importGame = new JMenuItem("Import Game");
        importGame.addActionListener(e -> importGame());
        importExportMenu.add(importGame);
        JMenuItem exportGame = new JMenuItem("Export Game");
        exportGame.addActionListener(e -> exportGame());
        importExportMenu.add(exportGame);
    private void exportGame() {
    private void importGame() {
}
