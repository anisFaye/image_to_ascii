import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class ImageResizer {
    public static int  imageType = BufferedImage.TYPE_INT_RGB;

    public static BufferedImage resize(BufferedImage originalImage, int newWidth){
        int originalHeight = originalImage.getHeight();
        int originalWidth = originalImage.getWidth();
        int newHeight = (originalHeight*newWidth)/originalWidth;

        newHeight = (int)(newHeight * 0.55);  

        BufferedImage resizedImage = new BufferedImage(newWidth, newHeight, imageType);
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(originalImage, 0, 0, newWidth, newHeight, null);
        g.dispose();
        return resizedImage;

    }
}
