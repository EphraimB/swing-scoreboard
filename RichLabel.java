
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;

public class RichLabel extends JLabel {
    //Horizontal and Vertical Offset Shadows.
    private int leftX = 0;
    private int leftY = 0;
    private int rightX = 0;
    private int rightY = 0;

    //Setting Colors.
    private Color leftColor = Color.LIGHT_GRAY;
    private Color rightColor = Color.DARK_GRAY;

    public RichLabel(String text) {
        super(text);
    }
    //Set positions of the shadows.
    public void setLeftShadow(int x, int y, Color color) {
        leftX = x;
        leftY = y;
        leftColor = color;
    }

    public void setRightShadow(int x, int y, Color color) {
        rightX = x;
        rightY = y;
        rightColor = color;
    }
//Overide JLabel Painting method to draw shadows.
    @Override
    protected void paintComponent(Graphics g) {

        int x = getInsets().left;
        int y = getInsets().right;

        //Drawing the shadows
        g.setColor(leftColor);
        g.drawString(getText(), x + leftX, y + leftY);
        g.setColor(rightColor);
        g.drawString(getText(), x + rightX, y + rightY);

        g.setColor(getForeground());
        g.drawString(getText(), x, y);
    }
}
