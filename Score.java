import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
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
    private JButton setTeamButton = null;

    int score = 0;

    public Score() {
        // Set to border layout
        setLayout(new BorderLayout());

        // Team information
        JPanel teamPanel = new JPanel();
        teamPanel.setLayout(new BoxLayout(teamPanel, BoxLayout.Y_AXIS));

        // Text field + Set button horizontally
        JPanel teamInputPanel = new JPanel(new FlowLayout());

        teamTextField = new JTextField(10);
        teamInputPanel.add(teamTextField);

        ImageIcon icon = new ImageIcon("img/green-arrow-png-24.png");

        Image scaledImage = icon.getImage().getScaledInstance(
                24, 24, Image.SCALE_SMOOTH);

        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        setTeamButton = new JButton("Set", scaledIcon);
        teamInputPanel.add(setTeamButton);

        teamPanel.add(teamInputPanel);

        // Team label underneath
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

        setTeamButton.addActionListener(e -> {
            teamLabel.setText(teamTextField.getText());
        });
    }

    // return elements so we can access their attributes
    public JTextField getTextField() {
        return teamTextField;
    }

}
