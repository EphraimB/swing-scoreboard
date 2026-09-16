import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;

public class Main {
    private static Header header = null;
    private static Center center = null;

    private static ConsolePrint consolePrint = null;

    private static void printToConsole() {
        consolePrint.print(
                header.getGreetingField().getText(),
                center.getScoreAway().getTeamLabel().getText(),
                center.getScoreAway().getScore(),
                center.getScoreHome().getTeamLabel().getText(),
                center.getScoreHome().getScore());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::createAndShowGUI);
    }

    public static void createAndShowGUI() {
        consolePrint = new ConsolePrint();

        // Main window
        JFrame frame = new JFrame("Text Components");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 350);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout(10, 10));

        /* Header Panel */
        header = new Header();
        frame.add(header.getHeaderPanel(), BorderLayout.NORTH);

        /* Center Panel */
        center = new Center(e -> printToConsole());
        frame.add(center.getCenterPanel(), BorderLayout.CENTER);

        /* Footer Panel */
        Footer footer = new Footer();
        frame.add(footer.getFooterPanel(), BorderLayout.SOUTH);

        /* Event Listeners */
        header.getUpdateButton()
                .addActionListener(
                        e -> {
                            center.getDisplayLabel().setText("Hello, " + header.getGreetingField().getText() + "!");

                            printToConsole();
                        });

        // Reset all inputs and labels everywhere when the reset button is clicked
        footer.getResetButton().addActionListener(e -> {
            // Reset greeting
            header.getGreetingField().setText("John Doe");

            // Reset away team's score
            center.getScoreAway().getTextField().setText("");
            center.getScoreAway().getTeamLabel().setText("Not set");
            center.getScoreAway().setScore(0);

            // Reset home team's score
            center.getScoreHome().getTextField().setText("");
            center.getScoreHome().getTeamLabel().setText("Not set");
            center.getScoreHome().setScore(0);

            printToConsole();
        });

        // Exits the program
        footer.getExitButton().addActionListener(e -> System.exit(0));

        frame.setVisible(true);
    }
}
