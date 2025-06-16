import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
public class ImageLoader{

    public  static BufferedImage  loadImage (File file){
        BufferedImage img = null ;
        try {
            img = ImageIO.read(file);
            
        } catch (IOException e) {
           System.out.println("Errro getting image");
        }
        return img;
    }
}
