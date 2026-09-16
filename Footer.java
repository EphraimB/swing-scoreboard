/*
    Author: Ephraim Becker/ Will Camara

    Footer.java

    Simple Swing based component to hold two buttons in a FlowLayout
*/

import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Footer {
    private JPanel footerPanel = null;
    private JButton exitBtn = null;
    private JButton resetBtn = null;

    public Footer() {
        // Flow layout panel
        footerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        // Exit button
        exitBtn = new JButton("Exit", new ImageIconSwing("img/exit.png", 30));

        // Reset button
        resetBtn = new JButton("Reset", new ImageIconSwing("img/restart-icon-9.png", 30));

        // Add both buttons
        footerPanel.add(resetBtn);
        footerPanel.add(exitBtn);

    }

    // Getters
    public JPanel getFooterPanel() {
        return footerPanel;
    }

    public JButton getExitButton() {
        return exitBtn;
    }

    public JButton getResetButton() {
        return resetBtn;
    }
}
