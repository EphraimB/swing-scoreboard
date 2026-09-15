import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::createAndShowGUI);
    }

    public static void createAndShowGUI() {
        // Main window
        JFrame frame = new JFrame("Text Components");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 350);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout(10, 10));

        /* Header Panel */
        Header header = new Header();
        frame.add(header.getHeaderPanel(), BorderLayout.NORTH);

        /* Center Panel */
        Center center = new Center();
        frame.add(center.getCenterPanel(), BorderLayout.CENTER);

        /* Footer Panel */
        Footer footer = new Footer();
        frame.add(footer.getFooterPanel(), BorderLayout.SOUTH);

        /* Event Listeners */
        header.getUpdateButton()
                .addActionListener(
                        e -> center.getDisplayLabel().setText("Hello, " + header.getGreetingField().getText() + "!"));

        footer.getExitButton().addActionListener(e -> System.exit(0));

        frame.setVisible(true);
    }
}
