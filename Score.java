import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Score extends JPanel {
    private JTextField teamTextField = null;
    private JLabel teamLabel = null;
    private RichLabel scoreLabel = null;
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

        setTeamButton = new JButton("Set", new ImageIconSwing("img/green-arrow-png-24.png", 24));
        teamInputPanel.add(setTeamButton);

        teamPanel.add(teamInputPanel);

        // Team label underneath
        teamLabel = new JLabel("Not set");
        teamPanel.add(teamLabel);

        add(teamPanel, BorderLayout.NORTH);

        // Score controls - all horizontal
        JPanel scorePanel = new JPanel(new FlowLayout());

        decrementButton = new JButton("-");
        decrementButton.setEnabled(false);
        scorePanel.add(decrementButton);

        scoreLabel = new RichLabel("" + score);
        scorePanel.add(scoreLabel);

        scoreLabel.setLeftShadow(3, 3, Color.LIGHT_GRAY);
        scoreLabel.setRightShadow(-2, -2, Color.DARK_GRAY);
        scoreLabel.setForeground(Color.BLACK);
        scoreLabel.setFont(scoreLabel.getFont().deriveFont(Font.BOLD, 48f));
    

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
            decrementButton.setEnabled(true);
        });

        // Decrement score. Disables Minus Button when score = 0
        decrementButton.addActionListener(e -> {
            if (score > 0) {
                score--;
            }
            scoreLabel.setText(String.valueOf(score));
            if (score == 0) {
                decrementButton.setEnabled(false);
            }
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
