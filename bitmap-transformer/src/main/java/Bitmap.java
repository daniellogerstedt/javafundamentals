import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.file.FileSystems;
import java.util.Arrays;

public class Bitmap {
    BufferedImage image;
    int height;
    int width;


    public Bitmap(String file) {
        try {
            image = ImageIO.read(FileSystems.getDefault().getPath("resources/bitmap.bmp").toFile());
            height = image.getHeight();
            width = image.getWidth();
//            System.out.println(Arrays.toString(image.getRGB(0, 0, 100, 100, colorTable, 0, 1)));
//            Color color = new Color(image.getRGB(0, 0), true);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
