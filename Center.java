/*
    Author: Ephraim Becker

    Footer.java

    Simple Swing based component
*/

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Center {
    private JPanel centerPanel = null;
    private JTextArea textArea = null;
    private JLabel displayLabel = null;

    public Center() {
        centerPanel = new JPanel(new BorderLayout(5, 5));

        // This label will display the greeting text from the header component.
        displayLabel = new JLabel("Hello, John Doe!", SwingConstants.CENTER);
        displayLabel.setFont(displayLabel.getFont().deriveFont(Font.BOLD, 18f));
        centerPanel.add(displayLabel, BorderLayout.NORTH);

        textArea = new JTextArea(
                "This is a JTextArea.\n" +
                        "You can type anything here.\n" +
                        "It demonstrates a multi-line component.");
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(textArea);
        centerPanel.add(scrollPane, BorderLayout.CENTER);
    }

    // return elements so we can access their attributes
    public JPanel getCenterPanel() {
        return centerPanel;
    }

    public JLabel getDisplayLabel() {
        return displayLabel;
    }

    public JTextArea getTextArea() {
        return textArea;
    }
}
