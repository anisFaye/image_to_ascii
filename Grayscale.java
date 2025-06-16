import java.awt.image.BufferedImage;

public class Grayscale {

    public static BufferedImage gray(BufferedImage image){
        int width = image.getWidth();
        int height = image.getHeight();

        for(int y=0;y<height;y++){
            for(int x=0;x<width;x++){
                int pixel = image.getRGB(x,y);

                int r = (pixel >> 16) & 0xFF;
                int g = (pixel >> 8) & 0xFF;
                int b = pixel & 0xFF;
                int alpha = (pixel >> 24) & 0xFF;

                int gray = (int) (0.2126*r + 0.7152*g + 0.0722*b);
                int grayPixel = (alpha << 24) | (gray << 16) | (gray << 8) | gray;

                image.setRGB(x, y, grayPixel);
                
            }
        }
        return image;
    }
}
