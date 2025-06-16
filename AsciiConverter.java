import java.awt.image.BufferedImage;

public class AsciiConverter {
    static String asciiGradient = "@%#*+=-:. ";
    private static int height=0;
    private static int width=0;
    
    public static char[][] convert(BufferedImage grayImage ){
        Character ch;
        height = grayImage.getHeight();
        width = grayImage.getWidth();
        char [][] asci = new char [height][width]; 

        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                int pixel = grayImage.getRGB(j,i);
                int gray =pixel & 0xFF;

                int index = (gray * (asciiGradient.length() - 1)) / 255;
                ch = asciiGradient.charAt(asciiGradient.length() - 1 - index);

                asci[i][j]= ch;
            }
        }
        return asci;

    }

    public static String[] render( char[][] grid){
        int height = grid.length;
        int width = grid[0].length;
        String asciiString[] = new String[height];
        for(int x=0; x<height; x++){
            StringBuilder str = new StringBuilder();
            for(int y=0;y<width;y++){
                char ch = grid[x][y];
                str.append(ch);
            }
            asciiString[x] = str.toString();
        }
        return asciiString;
    }
}
