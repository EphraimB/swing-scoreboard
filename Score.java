import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Score extends JPanel {
    private JTextField teamTextField = null;
    private JLabel teamLabel = null;
    private JLabel scoreLabel = null;
    private JButton incrementButton = null;
    private JButton decrementButton = null;

    int score = 0;

    public Score() {
        setLayout(new BorderLayout());

        // Team information
        JPanel teamPanel = new JPanel();
        teamPanel.setLayout(new BoxLayout(teamPanel, BoxLayout.Y_AXIS));
        teamTextField = new JTextField(1);
        teamPanel.add(teamTextField);

        teamLabel = new JLabel("Not set");
        teamPanel.add(teamLabel);

        add(teamPanel, BorderLayout.NORTH);

        // Score controls - all horizontal
        JPanel scorePanel = new JPanel(new FlowLayout());

        decrementButton = new JButton("-");
        scorePanel.add(decrementButton);

        scoreLabel = new JLabel("" + score);
        scorePanel.add(scoreLabel);

        incrementButton = new JButton("+");
        scorePanel.add(incrementButton);

        add(scorePanel, BorderLayout.CENTER);

        // Update team name when Enter is pressed
        teamTextField.addActionListener(e -> {
            teamLabel.setText(teamTextField.getText());
        });

        // Increment score
        incrementButton.addActionListener(e -> {
            score++;
            scoreLabel.setText(String.valueOf(score));
        });

        // Decrement score
        decrementButton.addActionListener(e -> {
            if (score > 0) {
                score--;
            }
            scoreLabel.setText(String.valueOf(score));
        });
    }

    // return elements so we can access their attributes
    public JTextField getTextField() {
        return teamTextField;
    }

}
