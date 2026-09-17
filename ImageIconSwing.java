/*
    Author: Ephraim Becker/ Will Camara

    ImageIconSwing.java

    Creates and resizes the image icon
*/
import java.awt.Image;
import javax.swing.ImageIcon;

public class ImageIconSwing extends ImageIcon {
    /**
     * 
     * @param path - Path to image filename
     * @param size - Size of the image resized to
     */
    public ImageIconSwing(String path, int size) {
        // New image icon to the path
        ImageIcon icon = new ImageIcon(path);

        // Resizes the image
        Image scaledImage = icon.getImage().getScaledInstance(
                size, size, Image.SCALE_SMOOTH);

        // Sets the image to the scaled image
        setImage(scaledImage);

    }
}
