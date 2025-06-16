import java.io.File;
import java.awt.image.BufferedImage;

public class Printer {
    public static void print(String[] str){
        for(String row : str){
            System.out.println(row);
        }
    }

    public static void main(String[] args){
        BufferedImage img = ImageLoader.loadImage(new File("kawai.png"));
        if (img == null) {
           System.out.println("Failed to load image.");
           return;
        }
        BufferedImage resizedImg = ImageResizer.resize(img,100);
        BufferedImage grayImage = Grayscale.gray(resizedImg);
        char[][] ch = AsciiConverter.convert(grayImage);
        String [] str = AsciiConverter.render(ch);
        print(str);
    }
}
