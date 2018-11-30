import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.file.FileSystems;
import java.util.Arrays;

public class Bitmap {
    Buffer allData;
    Buffer pixelArray;
    Buffer colorTable;
    Buffer pixelArrayOffset;
    Buffer imageWidth;
    Buffer imageHeight;
    Buffer compression;
    Buffer bitsPerPixel;

    public Bitmap(String file) {
        try {
            BufferedImage image = ImageIO.read(FileSystems.getDefault().getPath("resources/bitmap.bmp").toFile());
            int[] colorTable = new int[image.getHeight()*image.getWidth()];
            System.out.println(Arrays.toString(image.getRGB(0, 0, 100, 100, colorTable, 0, 1)));
            Color temp = new Color(image.getRGB(0, 0), true);
            System.out.println(temp.getRed());
            System.out.println(temp.getGreen());
            System.out.println(temp.getBlue());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
