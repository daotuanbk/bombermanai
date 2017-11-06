package bases;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Utils {
    public static BufferedImage loadImage (String url) {
        try {
            BufferedImage image = ImageIO.read(new File(url));
            return image;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }
    public static String readTextFile (String url) {
        try {
            return new String (Files.readAllBytes(Paths.get(url)));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
