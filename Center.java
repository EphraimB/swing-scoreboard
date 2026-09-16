/*
    Author: Ephraim Becker/ Will Camara

    Center.java

    Simple Swing based component
*/

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Center {
    private JPanel centerPanel = null;
    private JLabel displayLabel = null;
    private Score scoreAway = null;
    private Score scoreHome = null;

    public Center(ActionListener printListener) {
        centerPanel = new JPanel(new BorderLayout(5, 5));

        // This label will display the greeting text from the header component.
        displayLabel = new JLabel("Hello, John Doe!", SwingConstants.CENTER);
        displayLabel.setFont(displayLabel.getFont().deriveFont(Font.BOLD, 18f));
        centerPanel.add(displayLabel, BorderLayout.NORTH);

        // Adds away team's score
        scoreAway = new Score(printListener);
        centerPanel.add(scoreAway, BorderLayout.WEST);

        // Adds home team's score
        scoreHome = new Score(printListener);
        centerPanel.add(scoreHome, BorderLayout.EAST);
    }

    // return elements so we can access their attributes
    public JPanel getCenterPanel() {
        return centerPanel;
    }

    public JLabel getDisplayLabel() {
        return displayLabel;
    }

    public Score getScoreAway() {
        return scoreAway;
    }

    public Score getScoreHome() {
        return scoreHome;
    }
}
