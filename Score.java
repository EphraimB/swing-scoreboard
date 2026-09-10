import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Score {
    private JTextField teamTextField = null;
    private JLabel teamLabel = null;
    private JLabel scoreLabel = null;
    private JButton incrementButton = null;
    private JButton decrementButton = null;

    int score = 0;

    public Score() {
        teamTextField = new JTextField();

        teamLabel = new JLabel("Not set");

        incrementButton = new JButton("+");

        scoreLabel = new JLabel("" + score);

        decrementButton = new JButton("-");
    }

    // return elements so we can access their attributes
    public JTextField getTextField() {
        return teamTextField;
    }

    public JLabel getTeamLabel() {
        return teamLabel;
    }

    public JButton getIncrementButton() {
        return incrementButton;
    }

    public JButton getDecrementButton() {
        return decrementButton;
    }
}
