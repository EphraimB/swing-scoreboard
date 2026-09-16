import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;

public class Main {
    private static Header header = null;
    private static Center center = null;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::createAndShowGUI);
    }

    public static void updateSystemWrite() {
        System.out.println("Name: " + header.getGreetingField().getText());
        System.out.println(center.getScoreAway().getTeamLabel().getText() + ": " + center.getScoreAway().getScore());
        System.out.println(center.getScoreHome().getTeamLabel().getText() + ": " + center.getScoreHome().getScore());
    }

    public static void createAndShowGUI() {
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
        center = new Center();
        frame.add(center.getCenterPanel(), BorderLayout.CENTER);

        /* Footer Panel */
        Footer footer = new Footer();
        frame.add(footer.getFooterPanel(), BorderLayout.SOUTH);

        /* Event Listeners */
        header.getUpdateButton()
                .addActionListener(
                        e -> {
                            center.getDisplayLabel().setText("Hello, " + header.getGreetingField().getText() + "!");

                            updateSystemWrite();
                        });

        System.out.println(center.getScoreAway().getTeamLabel().getText() + ": " + center.getScoreAway().getScore());
        System.out.println(center.getScoreHome().getTeamLabel() + ": " + center.getScoreHome().getScore());

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

            // Call the method to print the name and score to the console
            updateSystemWrite();
        });

        // Exits the program
        footer.getExitButton().addActionListener(e -> System.exit(0));

        frame.setVisible(true);
    }
}
