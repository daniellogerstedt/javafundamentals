import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.util.HashMap;
import java.util.Map;

public class Bitmap {
    BufferedImage image;
    int height;
    int width;


    public Bitmap(String file) {
        try {
            this.image = ImageIO.read(FileSystems.getDefault().getPath(file).toFile());
            this.height = this.image.getHeight();
            this.width = this.image.getWidth();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeBitmap (String outputName) {
        try {
            ImageIO.write(this.image, "bmp", FileSystems.getDefault().getPath(outputName).toFile());

        } catch (IOException e){
            System.err.println(e);
        }
    }

    public void greyScale() {
        for (int y = 0; y < this.height; y++) {
            for (int x = 0; x < this.width; x++) {
                Color color = new Color(this.image.getRGB(x, y));
                int red = color.getRed();
                int green = color.getGreen();
                int blue = color.getBlue();
                int calcGrey = (red + green + blue) / 3;
                int newRGB = new Color(calcGrey, calcGrey, calcGrey).getRGB();
                this.image.setRGB(x, y, newRGB);
            }
        }
    }

    public void negative() {
        for (int y = 0; y < this.height; y++) {
            for (int x = 0; x < this.width; x++) {
                Color color = new Color(this.image.getRGB(x, y));
                int red = 255 - color.getRed();
                int green = 255 - color.getGreen();
                int blue = 255 - color.getBlue();
                int newRGB = new Color(red, green, blue).getRGB();
                this.image.setRGB(x, y, newRGB);
            }
        }
    }

    public void rotateColors() {
        for (int y = 0; y < this.height; y++) {
            for (int x = 0; x < this.width; x++) {
                Color color = new Color(this.image.getRGB(x, y));
                int green = color.getRed();
                int blue = color.getGreen();
                int red = color.getBlue();
                int newRGB = new Color(red, green, blue).getRGB();
                this.image.setRGB(x, y, newRGB);
            }
        }
    }

    public void randomize() {
        for (int y = 0; y < this.height; y++) {
            for (int x = 0; x < this.width; x++) {
                Color color = new Color(this.image.getRGB(x, y));
                int green = (int)(Math.random() * 255);
                int blue = (int)(Math.random() * 255);
                int red = (int)(Math.random() * 255);
                int newRGB = new Color(red, green, blue).getRGB();
                this.image.setRGB(x, y, newRGB);
            }
        }
    }

    public void randomizeStructured() {
        Map<Color, Integer> colors = new HashMap<>();
        for (int y = 0; y < this.height; y++) {
            for (int x = 0; x < this.width; x++) {
                    Color color = new Color(this.image.getRGB(x, y));
                if (colors.containsKey(color)) {
                    this.image.setRGB(x, y, colors.get(color));
                } else {
                    int green = (int)(Math.random() * 255);
                    int blue = (int)(Math.random() * 255);
                    int red = (int)(Math.random() * 255);
                    int newRGB = new Color(red, green, blue).getRGB();
                    colors.put(color, newRGB);
                    this.image.setRGB(x, y, newRGB);
                }
            }
        }
    }
}
