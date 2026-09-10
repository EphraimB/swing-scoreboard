import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Score {
    private JLabel teamLabel = null;
    private JLabel scoreLabel = null;
    private JButton incrementButton = null;
     private JButton decrementButton = null;

    int score = 0;

    public Score() {
        teamLabel = new JLabel("Not set");
        headerPanel.add(greetingField);

        updateBtn = new JButton("Submit");
        headerPanel.add(updateBtn);
    }

    // return elements so we can access their attributes
    public JPanel getHeaderPanel() {
        return headerPanel;
    }

    public JLabel getGreetingLabel() {
        return greetingLabel;
    }

    public JTextField getGreetingField() {
        return greetingField;
    }

    public JButton getUpdateButton() {
        return updateBtn;
    }
}
