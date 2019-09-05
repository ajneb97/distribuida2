import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.IOException;

public class DimensionI implements Demo.Dimension
{
    public String getDimensiones(byte[] b, com.zeroc.Ice.Current current)
    {
        InputStream target = new ByteArrayInputStream(b);
        try{
            BufferedImage bimg = ImageIO.read(target);
            String d = bimg.getWidth()+"x"+bimg.getHeight();
            return d;
        }catch(IOException e){
          e.printStackTrace();
        }
	return "";
    }
}

