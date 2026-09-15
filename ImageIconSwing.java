import java.awt.Image;

import javax.swing.ImageIcon;

public class ImageIconSwing extends ImageIcon {
    public ImageIconSwing(String path, int size) {
        ImageIcon icon = new ImageIcon(path);

        Image scaledImage = icon.getImage().getScaledInstance(
                size, size, Image.SCALE_SMOOTH);

        setImage(scaledImage);

    }
}
