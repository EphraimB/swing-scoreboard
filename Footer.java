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
    private JButton clearBtn = null;
    private JButton exitBtn = null;

    public Footer() {
        footerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        clearBtn = new JButton("Clear Text Area");
        exitBtn = new JButton("Exit");

        footerPanel.add(clearBtn);
        footerPanel.add(exitBtn);
    }

    public JPanel getFooterPanel() {
        return footerPanel;
    }

    public JButton getClearButton() {
        return clearBtn;
    }

    public JButton getExitButton() {
        return exitBtn;
    }
}
