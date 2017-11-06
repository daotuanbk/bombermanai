package bases.physics;

import bases.Utils;
import bases.Vector2D;

import java.awt.*;
import java.awt.image.BufferedImage;

public class ImageRenderer implements Renderer {
    public BufferedImage image;

    public ImageRenderer (BufferedImage image) {
        this.image = image;
    }

    public ImageRenderer (String url) {
        this.image = Utils.loadImage(url);
    }

    public void render (Graphics g, Vector2D position) {
        if (image != null) {
            g.drawImage(image, (int) position.x, (int) position.y, null);
        }
    }
}
