import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String urlImage = "https://img.freepik.com/foto-gratis/pintura-lago-montana-montana-al-fondo_188544-9126.jpg";
        double result = calculateAspectRatio(urlImage);

        System.out.println("The aspect ratio of the image is: "+ result);
    }

    static double calculateAspectRatio(String pathImage){

        try{
            BufferedImage image = ImageIO.read(new File(pathImage));

            return (double) image.getHeight() / image.getWidth();
        }catch (IOException io){
            throw new RuntimeException(io.getMessage());
        }
    }
}